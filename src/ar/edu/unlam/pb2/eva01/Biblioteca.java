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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void prestarLibro(int codigoLibro, Estudiante estudiante) {
        for (Libro libro : this.libros) {
            if(existeLibro(codigoLibro,libro.getCodigo())) {
                if(libro.getHabilitado()){
                   if(estudianteHabilidatoAAdquirirLibro(estudiant))
                }
            }
        }
    }

    private boolean existeLibro(Integer codigoLibroPedido, Integer codigoLibroBiblioteca) {
        if(codigoLibroPedido.equals(codigoLibroBiblioteca)){
            return true;
        }else {
            return false;
        }
    }
}
