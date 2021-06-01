package ar.edu.unlam.pb2.eva01;

import org.junit.Assert;
import org.junit.Test;

public class BibliotecaTest {

    @Test
    public void existeBiblioteca(){
        Libro libro = new Geografia("Argentina",1);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");

        Assert.assertNotNull(biblioteca);
    }
}
