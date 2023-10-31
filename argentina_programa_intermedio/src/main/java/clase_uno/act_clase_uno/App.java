package clase_uno.act_clase_uno;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Jose");
        alumno.setApellido("Perez");
        alumno.setMateriasAprobadas(getMateriaAlumno());

        Materia materia = new Materia("Matematica");
        materia.setCorrelativas(getMateriaCorrelativas());

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setMateria(materia);
        inscripcion.setAlumno(alumno);


        System.out.println(inscripcion.aprobada());

    }

    static List<Materia> getMateriaAlumno() {
        List<Materia> materiasAprobadas = new ArrayList<>();
        Materia materiaA1 = new Materia("Matematica");
        Materia materiaA2 = new Materia("Lengua");
//        Materia materiaA3 = new Materia("Algebra");

        materiasAprobadas.add(materiaA1);
        materiasAprobadas.add(materiaA2);
//        materiasAprobadas.add(materiaA3);

        return materiasAprobadas;
    }

    static List<Materia> getMateriaCorrelativas() {
        List<Materia> materiasAprobadas = new ArrayList<>();
        Materia materiaC1 = new Materia("Matematica");
        Materia materiaC2 = new Materia("Lengua");
        Materia materiaC3 = new Materia("Algebra");

        materiasAprobadas.add(materiaC1);
        materiasAprobadas.add(materiaC2);
        materiasAprobadas.add(materiaC3);

        return materiasAprobadas;
    }
}
