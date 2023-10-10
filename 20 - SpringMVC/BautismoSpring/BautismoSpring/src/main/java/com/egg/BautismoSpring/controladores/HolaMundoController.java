package com.egg.BautismoSpring.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/holaMundo/{usuario}")
    public String saludo(@PathVariable String usuario){

        return "Hola usuario " + usuario;

    }
    @GetMapping("/sumar/{numeroA}/{numeroB}")
    public int suma(@PathVariable int numeroA, @PathVariable int numeroB){
        return numeroA + numeroB;
    }
}