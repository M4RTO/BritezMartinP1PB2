package ar.edu.unlam.pb2.eva01;

import org.junit.Assert;
import org.junit.Test;

public class LibroTest {

    @Test
    public void probarSiEsFotocopiable(){
        Geografia libro1 = new Geografia("Argentina",1,"Pepe");
        Historia libro2 = new Historia("San Martin",3,"Pepe");

        String fotocopiado1 = libro1.fotocopiar();
        String fotocopiado2 = libro2.fotocopiar();

        Assert.assertEquals(fotocopiado1,"Argentina Pepe 1");
        Assert.assertEquals(fotocopiado2,"San Martin Pepe 3");
    }
}
