package ar.edu.unlam.pb2.eva01;

public abstract class Libro {

    private String nombre;
    private Integer codigo;
    private String autor;
    private Boolean habilitado;
    private TipoFotocopiable tipoFotocopiable;

    public Libro(String nombre, Integer codigo, String autor,TipoFotocopiable tipoFotocopiable) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.autor = autor;
        this.habilitado = true;
        this.tipoFotocopiable = tipoFotocopiable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public TipoFotocopiable getTipoFotocopiable() {
        return tipoFotocopiable;
    }

    public void setTipoFotocopiable(TipoFotocopiable tipoFotocopiable) {
        this.tipoFotocopiable = tipoFotocopiable;
    }
}
