package ar.edu.unlam.pb2.eva01;

import java.util.List;

public class Biblioteca {

    private String name;
    private List<Libro> libros;
    private List<Prestamo> prestamos;

    public Biblioteca(String name, List<Libro> libros, List<Prestamo> prestamos) {
        this.name = name;
        this.libros = libros;
        this.prestamos = prestamos;
    }
}
