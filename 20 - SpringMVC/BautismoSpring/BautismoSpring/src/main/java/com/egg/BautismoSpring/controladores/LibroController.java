package com.egg.BautismoSpring.controladores;

import com.egg.BautismoSpring.model.Libro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroController {
    ArrayList<Libro> libros = new ArrayList<Libro>(
            List.of(
                    new Libro("El problema de los 3 cuerpos", "Cixin Liu", 260),
                    new Libro("La inmortalidad", "Milan Kundera", 200),
                    new Libro("Pelando la cebolla", "Günter Grass", 321),
                    new Libro("El péndulo", "Humbert Eco", 467),
                    new Libro("La sombra del viento", "Carlos Ruiz Zafón", 222)
            )
    );

    @GetMapping
    public List<Libro> listarTodos(){
        return libros;
    }

    @GetMapping("/{titulo}")
    public Libro recuperarLibroPorNombre(@PathVariable String titulo) {
        for (Libro libro: libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        return null;
    }

    @PostMapping("/libros")
    public void crearLibro(@RequestBody Libro libro){
        libros.add(libro);
    }

    @DeleteMapping("/{titulo}")
    public void eliminarLibro(@PathVariable String titulo){
        Optional<Libro> optLibro = libros.stream().filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo)).findFirst();
        if (optLibro.isPresent()){
            libros.remove(optLibro.get());

        }
    }

    @PutMapping ("/{nombre}")
    public void  modificarLibro(@RequestBody Libro libroModif){
        for (Libro libro: libros) {
            if (libro.getTitulo().equalsIgnoreCase(libroModif.getTitulo())){
                libro.setAutor(libroModif.getAutor());
                libro.setNumPag(libroModif.getNumPag());
            }
        }
    }
}