package clase_cuatro.patrones_creacion.abstract_factory;

public class HeroeFactory implements PersonajeFactory {
    public Personaje crearPersonaje() {
        return new Heroe();
    }

    public Arma crearArma() {
        return new Espada();
    }
}
