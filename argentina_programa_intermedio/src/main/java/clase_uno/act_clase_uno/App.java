package clase_uno.act_clase_uno;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Jose");
        alumno.setApellido("Perez");
        alumno.setMateriasAprobadas(getMateriaAlumno());

        Materia materiaAInscribir = new Materia("Matematica I");
        materiaAInscribir.setCorrelativas(getMateriaCorrelativas());

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setMateria(materiaAInscribir);
        inscripcion.setAlumno(alumno);

        boolean inscripcionAprobada = inscripcion.aprobada();

        if (inscripcionAprobada) {
            System.out.println("Se pudo inscribir: ".concat(String.valueOf(inscripcionAprobada)));
        } else {
            System.out.println("No se pudo inscribir: ".concat(String.valueOf(inscripcionAprobada)));
        }


    }

    static List<Materia> getMateriaAlumno() {
        List<Materia> materiasAprobadas = new ArrayList<>();
        Materia materiaA1 = new Materia("Matematica Basica");
        Materia materiaA2 = new Materia("Lengua");
        Materia materiaA3 = new Materia("Algebra");

        materiasAprobadas.add(materiaA1);
        materiasAprobadas.add(materiaA2);
        materiasAprobadas.add(materiaA3);

        return materiasAprobadas;
    }

    static List<Materia> getMateriaCorrelativas() {
        List<Materia> materiasAprobadas = new ArrayList<>();
        Materia materiaC1 = new Materia("Matematica Basica");
        Materia materiaC2 = new Materia("Lengua");
        Materia materiaC3 = new Materia("Algebra");

//        materiasAprobadas.add(materiaC1);
        materiasAprobadas.add(materiaC2);
        materiasAprobadas.add(materiaC3);

        return materiasAprobadas;
    }
}
