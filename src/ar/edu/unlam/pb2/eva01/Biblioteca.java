package ar.edu.unlam.pb2.eva01;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String name;
    private List<Libro> libros;
    private List<Prestamo> prestamos;

    public Biblioteca(String name, List<Libro> libros) {
        this.name = name;
        this.libros = libros;
        this.prestamos = new ArrayList<>();
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

    public void prestarLibro(List<Integer> codigosLibro, Estudiante estudiante) {
        List<Libro> libros = new ArrayList<>();
        if(codigosLibro.size() < 3 ) {
            for (Libro libro : this.libros) {
                for (Integer codigoLibro : codigosLibro) {
                    if(existeLibro(codigoLibro,libro.getCodigo())) {
                        if(libro.getHabilitado()){
                            libro.setHabilitado(false);
                            if(estudianteHabilitadoAAdquirirLibro(estudiante)) {
                                libros.add(libro);
                            }
                        }
                    }
                }

            }
        }

        generarNuevoPrestamoDeLibro(estudiante,libros);
    }

    private void generarNuevoPrestamoDeLibro(Estudiante estudiante,List<Libro> libro) {
        int numero = this.prestamos.size();
        Prestamo prestamo = new Prestamo(numero + 1,estudiante,libro);
        this.prestamos.add(prestamo);
    }

    private Boolean estudianteHabilitadoAAdquirirLibro(Estudiante estudiante) {
        return true;
    }

    private boolean existeLibro(Integer codigoLibroPedido, Integer codigoLibroBiblioteca) {
        if(codigoLibroPedido.equals(codigoLibroBiblioteca)){
            return true;
        }else {
            return false;
        }
    }

    public Integer obtenerRegistroDePrestamos() {
        return this.prestamos.size();
    }

    public Prestamo obtenerInfoDelPrestamo(Integer codigoLibro) {
        for (Prestamo prestamo : this.prestamos) {
            if(prestamo.buscarPrestamoPorCodigoLibro(codigoLibro)) {
                return prestamo;
            };
        }
        return null;
    }


    public void devolverLibro(int codigoLibro) {
        for (Libro libro : this.libros) {
            if(existeLibro(codigoLibro, libro.getCodigo())){
                libro.setHabilitado(true);
            }
        }
    }

    public Boolean puedeImprimirLibro(Libro libro) {
        return  libro.getTipoFotocopiable().equals(TipoFotocopiable.FOTOCOPIABLE);
    }
}
