package clase_uno.herencia;

public class Herencia {

    public static void main(String[] args) {

        Futbol futbol = new Futbol("Futbol", 90, "Profesional");

//        futbol.setNombre("Futbol");
//        futbol.setTipoCancha("Profesional");
//        futbol.setDuracionPartido(90);

        Ajedrez ajedrez = new Ajedrez("Ajedrez", 1000);
//        ajedrez.setNombre("Ajedrez");
//        ajedrez.setCantidadMovimientos(1000);

        ajedrez.jugar();

        futbol.jugar();



    }

}
