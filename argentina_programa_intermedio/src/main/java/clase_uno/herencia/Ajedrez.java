package clase_uno.herencia;

public class Ajedrez extends Juego {

    public Ajedrez(String nombre, int cantidadMovimientos) {
        super(nombre);
        this.cantidadMovimientos = cantidadMovimientos;
    }

    int cantidadMovimientos;

    public int getCantidadMovimientos() {
        return cantidadMovimientos;
    }

    public void setCantidadMovimientos(int cantidadMovimientos) {
        this.cantidadMovimientos = cantidadMovimientos;
    }

    @Override
    public void jugar() {
        System.out.println("Estoy jugando a la ajedrez - Cantidad de movimientos: ".concat(String.valueOf(cantidadMovimientos)));
    }

}
