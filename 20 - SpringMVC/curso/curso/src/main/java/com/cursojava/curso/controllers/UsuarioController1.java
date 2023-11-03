package com.egg.cursoLucas.controllers;

import com.egg.cursoLucas.dao.UsuarioDao;
import com.egg.cursoLucas.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
//    public List<String> prueba(){
//        return List.of("Manzana", "Kiwi", "Banana", "Mango", "Papaya", "Naranja", "Mandarina");
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(78L);
        usuario.setNombre("Pao");
        usuario.setApellido("Tuki");
        usuario.setEmail("paolasotomayor@hotmail.com");
        usuario.setTelefono("1111111111");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "prueba")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Pao");
        usuario.setApellido("Tuki");
        usuario.setEmail("paolasotomayor@hotmail.com");
        usuario.setTelefono("1111111111");
        return usuario;
    }
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
usuarioDao.eliminar(id);
    }

    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Pao");
        usuario.setApellido("Tuki");
        usuario.setEmail("paolasotomayor@hotmail.com");
        usuario.setTelefono("1111111111");
        return usuario;
    }
}
