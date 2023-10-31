package clase_uno.herencia;

public class Futbol extends Juego{

    int duracionPartido;
    String tipoCancha;

    public Futbol(String nombre, int duracionPartido, String tipoCancha) {
        super(nombre);
        this.duracionPartido = duracionPartido;
        this.tipoCancha = tipoCancha;
    }

    public int getDuracionPartido() {
        return duracionPartido;
    }

    public void setDuracionPartido(int duracionPartido) {
        this.duracionPartido = duracionPartido;
    }

    public String getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    @Override
    public void jugar() {
        System.out.println("Estoy jugando al futbol - ".concat("Duración del partido: ").concat(String.valueOf(duracionPartido)));
    }
}
