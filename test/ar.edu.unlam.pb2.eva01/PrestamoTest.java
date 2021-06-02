package ar.edu.unlam.pb2.eva01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrestamoTest {

    @Test
    public void existePrestamo() {
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);
        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);
        Libro libro2 = new Matematica("Numeros",2,"Pepe",TipoFotocopiable.NO_FOTOCOPIABLE);
        Libro libro3 = new Historia("San Martin",3,"Pepe",TipoFotocopiable.FOTOCOPIABLE);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        Prestamo prestamo = new Prestamo(1 ,estudiante,libros);

        Assert.assertNotNull(prestamo);



    }

    @Test
    public void buscarPrestamoPorCodigoDeLibro() {
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);
        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);
        Libro libro2 = new Matematica("Numeros",2,"Pepe",TipoFotocopiable.NO_FOTOCOPIABLE);
        Libro libro3 = new Historia("San Martin",3,"Pepe",TipoFotocopiable.FOTOCOPIABLE);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        Prestamo prestamo = new Prestamo(1 ,estudiante,libros);

        Boolean resultado = prestamo.buscarPrestamoPorCodigoLibro(3);
        Boolean resultado2 = prestamo.buscarPrestamoPorCodigoLibro(6);

        Assert.assertTrue(resultado);
        Assert.assertFalse(resultado2);



    }
}
