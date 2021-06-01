package ar.edu.unlam.pb2.eva01;

import org.junit.Assert;
import org.junit.Test;

public class EstudianteTest {

    @Test
    public void existeNuevoEstudiante() {
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        Assert.assertNotNull(estudiante);

    };

    @Test
    public void existeNuevoEstudiante() {
        Estudiante estudiante = new Estudiante("Martin","Britez",36822159);

        Assert.assertNotNull(estudiante);

    };
}
