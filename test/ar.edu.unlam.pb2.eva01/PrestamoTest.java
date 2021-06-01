package ar.edu.unlam.pb2.eva01;

import java.util.ArrayList;
import java.util.List;

public class PrestamoTest {

    public void existePrestamo() {
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);
        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Geografia("Argentina",1,"Pepe");
        Libro libro2 = new Matematica("Numeros",1,"Pepe");
        Libro libro3 = new Historia("San Martin",1,"Pepe");

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        Prestamo prestamo = new Prestamo(1 ,estudiante,libros);



    }
}
