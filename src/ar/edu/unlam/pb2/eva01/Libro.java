package ar.edu.unlam.pb2.eva01;

public abstract class Libro {

    private String nombre;
    private Integer codigo;
    private String autor;

    public Libro(String nombre, Integer codigo, String autor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.autor = autor;
    }
}
