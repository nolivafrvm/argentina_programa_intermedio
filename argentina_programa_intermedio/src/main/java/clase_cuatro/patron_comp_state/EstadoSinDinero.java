package clase_cuatro.patron_comp_state;

public class EstadoSinDinero implements Estado{
    public void insertarDinero() {
        System.out.println("Dinero insertado");
    }

    public void expulsarDinero() {
        System.out.println("No hay dinero para devolver");
    }

    public void dispensar() {
        System.out.println("No se puede dispensar sin dinero");
    }
}
