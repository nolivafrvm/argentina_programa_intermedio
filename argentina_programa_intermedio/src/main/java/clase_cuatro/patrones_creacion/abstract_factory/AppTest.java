package clase_cuatro.patrones_creacion.abstract_factory;

public class AppTest {

    public static void main(String[] args) {
        // Utilizamos una factoría de héroes
        PersonajeFactory factory = new HeroeFactory();

        Personaje personaje = factory.crearPersonaje();
        Arma arma = factory.crearArma();

        personaje.mostrarInformacion();
        arma.atacar();

        factory = new VillanoFactory();
        arma = factory.crearArma();
        personaje = factory.crearPersonaje();

        personaje.mostrarInformacion();
        arma.atacar();
    }

}
