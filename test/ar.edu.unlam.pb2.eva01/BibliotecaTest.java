package ar.edu.unlam.pb2.eva01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaTest {

    @Test
    public void existeBiblioteca(){

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);
        Libro libro2 = new Matematica("Numeros",2,"Pepe",TipoFotocopiable.NO_FOTOCOPIABLE);
        Libro libro3 = new Historia("San Martin",3,"Pepe",TipoFotocopiable.FOTOCOPIABLE);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);


        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros);

        Assert.assertNotNull(biblioteca);
    }

    @Test
    public void prestarLibros(){
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);
        Libro libro2 = new Matematica("Numeros",2,"Pepe",TipoFotocopiable.NO_FOTOCOPIABLE);
        Libro libro3 = new Historia("San Martin",3,"Pepe",TipoFotocopiable.FOTOCOPIABLE);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);


        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros);

        List<Integer> codigosLibros = new ArrayList<>();
        codigosLibros.add(1);
        codigosLibros.add(3);

        biblioteca.prestarLibro(codigosLibros,estudiante);

        Assert.assertTrue(biblioteca.getPrestamos().get(0).getCodigo().equals(1));
        Assert.assertTrue(biblioteca.getPrestamos().get(0).getLibrosPrestados().get(0).getCodigo().equals(1));
        Assert.assertTrue(biblioteca.getPrestamos().get(0).getLibrosPrestados().get(1).getCodigo().equals(3));
    }


    @Test
    public void prestarLibrosHasta2PorEstudiante(){
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);
        Libro libro2 = new Matematica("Numeros",2,"Pepe",TipoFotocopiable.NO_FOTOCOPIABLE);
        Libro libro3 = new Historia("San Martin",3,"Pepe",TipoFotocopiable.FOTOCOPIABLE);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);


        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros);

        List<Integer> codigosLibros = new ArrayList<>();
        codigosLibros.add(1);
        codigosLibros.add(3);
        codigosLibros.add(2);

        biblioteca.prestarLibro(codigosLibros,estudiante);

        Assert.assertTrue(biblioteca.getPrestamos().get(0).getLibrosPrestados().size() == 0 );
    }

    @Test
    public void prestarLibrosYVerificarSiEstaHabilitadoElMismoParaPrestar(){
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);

        libros.add(libro1);
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros);

        List<Integer> codigosLibros = new ArrayList<>();
        codigosLibros.add(1);

        biblioteca.prestarLibro(codigosLibros,estudiante);

        Assert.assertFalse(libro1.getHabilitado());
    }

    @Test
    public void verificarCuantosPrestamosSeHicieron(){
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);
        libros.add(libro1);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros);

        List<Integer> codigosLibros = new ArrayList<>();
        codigosLibros.add(1);

        biblioteca.prestarLibro(codigosLibros,estudiante);

        Integer registros = biblioteca.obtenerRegistroDePrestamos();

        Assert.assertTrue(registros == 1);
    }

    @Test
    public void seDeseaObtenerInfoDelEstudianteAlQueSeLeHizoElPrestamo(){
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);
        Libro libro2 = new Matematica("Numeros",2,"Pepe",TipoFotocopiable.NO_FOTOCOPIABLE);
        libros.add(libro1);
        libros.add(libro2);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros);

        List<Integer> codigosLibros = new ArrayList<>();
        codigosLibros.add(1);
        codigosLibros.add(2);

        biblioteca.prestarLibro(codigosLibros,estudiante);

        Prestamo prestamo = biblioteca.obtenerInfoDelPrestamo(1);

        Assert.assertTrue(prestamo.getEstudiante().equals(estudiante));
    }


    @Test
    public void estudianteDevuelveLibroYSeverificaQueEsteHabilitado() {
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);
        Libro libro2 = new Matematica("Numeros",2,"Pepe",TipoFotocopiable.NO_FOTOCOPIABLE);
        Libro libro3 = new Historia("San Martin",3,"Pepe",TipoFotocopiable.FOTOCOPIABLE);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros);


        List<Integer> codigosLibros = new ArrayList<>();
        codigosLibros.add(1);
        codigosLibros.add(3);

        biblioteca.prestarLibro(codigosLibros,estudiante);



        biblioteca.devolverLibro(1);

        Assert.assertTrue(libro1.getHabilitado());

    };

    @Test
    public void imprimirLibrosQueSeanPosibles() {

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe",TipoFotocopiable.FOTOCOPIABLE);
        Libro libro2 = new Matematica("Numeros",2,"Pepe",TipoFotocopiable.NO_FOTOCOPIABLE);
        Libro libro3 = new Historia("San Martin",3,"Pepe",TipoFotocopiable.FOTOCOPIABLE);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional",libros);


        Boolean libro1PuedeImprimir = biblioteca.puedeImprimirLibro(libro1);
        Boolean libro2PuedeImprimir = biblioteca.puedeImprimirLibro(libro2);
        Boolean libro3PuedeImprimir = biblioteca.puedeImprimirLibro(libro3);

        Assert.assertTrue(libro1PuedeImprimir);
        Assert.assertFalse(libro2PuedeImprimir);
        Assert.assertTrue(libro3PuedeImprimir);

    };
}
