package clase_cuatro.patrones_comportamiento.patron_comp_state;

public class MaquinaExpendedora { // Contexto
    private Estado estado;

    public MaquinaExpendedora() {
        estado = new EstadoSinDinero();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void insertarDinero() {
        estado.insertarDinero();
        if (estado instanceof EstadoConDinero) {
            setEstado(new EstadoConDinero());
        }
    }

    public void expulsarDinero() {
        estado.expulsarDinero();
        if (estado instanceof EstadoSinDinero) {
            setEstado(new EstadoSinDinero());
        }
    }

    public void dispensar() {
        estado.dispensar();
        if (estado instanceof EstadoConDinero) {
            setEstado(new EstadoSinDinero());
        }
    }
}
