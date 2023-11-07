package com.example.Spring.Security.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //Configuration one
    /*@Bean
    @SuppressWarnings("removal")
    public SecurityFilterChain filterchain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests()
                    .requestMatchers("/v1/index2").permitAll()
                    .anyRequest().authenticated()
                .and()
                .formLogin().permitAll()
                .and()
                .httpBasic() //Se envian las credenciales en el header
                .and()
                .build();
    }*/

    //Configuration two
    @Bean
    @SuppressWarnings("removal")
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/v1/index2").permitAll();
                    auth.anyRequest().authenticated();
                })
                .formLogin()
                    .successHandler(successHandler()) //URL a donde se va a dirigir luego de iniciar sesion
                    .permitAll()
                .and()
                .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.ALWAYS) //ALWAYS -- IF_REQUIRED -- NEVER -- STATELESS
                    .invalidSessionUrl("/login")
                    .maximumSessions(1)
                    .expiredUrl("/login")
                    .sessionRegistry(sessionRegistry())
                .and()
                .sessionFixation() //aquí se ve como proteger las vulnerabilidades
                    .migrateSession()// cuando se detecta un ataque de fijación de sesión, se genera otro Id de sesión.
                .and()
                .httpBasic()
                .and()
                .build();
    }

    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();

    }

    public AuthenticationSuccessHandler successHandler(){
        return ((request, response, authentication) -> {
           response.sendRedirect("/v1/session");
        });
    }
}