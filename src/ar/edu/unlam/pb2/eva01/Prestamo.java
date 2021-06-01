package ar.edu.unlam.pb2.eva01;

import java.util.List;

public class Prestamo {

    private Integer codigo;
    private Estudiante estudiante;
    private List<Libro> librosPrestados;

    public Prestamo(Integer codigo, Estudiante estudiante, List<Libro> librosPrestados) {
        this.codigo = codigo;
        this.estudiante = estudiante;
        this.librosPrestados = librosPrestados;
    }
}
