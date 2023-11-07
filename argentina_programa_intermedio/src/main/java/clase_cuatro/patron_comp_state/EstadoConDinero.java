package clase_cuatro.patron_comp_state;

public class EstadoConDinero implements Estado{
    public void insertarDinero() {
        System.out.println("Ya tienes dinero insertado");
    }

    public void expulsarDinero() {
        System.out.println("Dinero devuelto");
    }

    public void dispensar() {
        System.out.println("Producto vendido");
    }
}
