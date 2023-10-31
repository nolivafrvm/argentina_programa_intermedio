package clase_uno.act_clase_uno;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private List<Materia> correlativas = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}
