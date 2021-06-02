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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    protected  Boolean buscarPrestamoPorCodigoLibro(Integer codigoLibro) {
        Integer resultado = 0;
        for (Libro librosPrestado : this.getLibrosPrestados()) {
            if(librosPrestado.getCodigo().equals(codigoLibro)) {
                resultado = +1;
            }
        }
        return resultado > 0;
    }
}
