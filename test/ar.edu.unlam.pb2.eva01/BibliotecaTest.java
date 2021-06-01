package ar.edu.unlam.pb2.eva01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaTest {

    @Test
    public void existeBiblioteca(){
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe");
        Libro libro2 = new Matematica("Numeros",2,"Pepe");
        Libro libro3 = new Historia("San Martin",3,"Pepe");

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        List<Prestamo> prestamos = new ArrayList<>();
        Prestamo prestamo = new Prestamo(1,estudiante,libros);
        prestamos.add(prestamo);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros,prestamos);

        Assert.assertNotNull(biblioteca);
    }

    @Test
    public void prestarLibros(){
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe");
        Libro libro2 = new Matematica("Numeros",2,"Pepe");
        Libro libro3 = new Historia("San Martin",3,"Pepe");

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        List<Prestamo> prestamos = new ArrayList<>();

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros,prestamos);

        List<Integer> codigosLibros = new ArrayList<>();
        codigosLibros.add(1);
        codigosLibros.add(3);

        biblioteca.prestarLibro(codigosLibros,estudiante);

        Assert.assertTrue(prestamos.get(0).getCodigo().equals(1));
        Assert.assertTrue(prestamos.get(0).getLibrosPrestados().get(0).getCodigo().equals(1));
        Assert.assertTrue(prestamos.get(0).getLibrosPrestados().get(1).getCodigo().equals(3));
    }
}
