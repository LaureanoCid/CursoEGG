package com.egg.BautismoSpring.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Libro {
    @NonNull
    private String titulo;

    @NonNull
    private String autor;

    @NonNull
    private int numPag;
}
