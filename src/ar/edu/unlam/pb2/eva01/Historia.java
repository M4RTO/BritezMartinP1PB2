package ar.edu.unlam.pb2.eva01;

public class Historia extends Libro implements IFotocopiable {

    public Historia(String nombre, Integer codigo, String autor) {
        super(nombre, codigo, autor);
    }

    @Override
    public String fotocopiar() {
        return super.getNombre() + " " + super.getAutor() + " " + super.getCodigo();
    }

}
