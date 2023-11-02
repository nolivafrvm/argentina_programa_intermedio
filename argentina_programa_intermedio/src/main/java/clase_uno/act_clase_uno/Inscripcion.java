package clase_uno.act_clase_uno;

import java.util.List;

public class Inscripcion {

    private Alumno alumno;
    private Materia materia;

    public boolean aprobada() {


        List<Materia> materiasCorrelativas = this.getMateria().getCorrelativas();


        List<Materia> materiasAlumno = this.getAlumno().getMateriasAprobadas();

        if (materiasCorrelativas.isEmpty()) {
            return true;
        }

        boolean estaAprobada = false;
        for (Materia materiaCorrelativa: materiasCorrelativas) {

            for (Materia materiaAprobadaAlumno: materiasAlumno) {
                if (materiaCorrelativa.getNombre().equalsIgnoreCase(materiaAprobadaAlumno.getNombre())) {
                    estaAprobada = true;
                    break;
                } else {
                    estaAprobada = false;
                }
            }
            if (estaAprobada==false) {
                return estaAprobada;
            }
        }

        return true;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
