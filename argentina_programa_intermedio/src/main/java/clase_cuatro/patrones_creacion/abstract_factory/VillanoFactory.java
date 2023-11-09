package clase_cuatro.patrones_creacion.abstract_factory;

public class VillanoFactory implements PersonajeFactory {
    @Override
    public Personaje crearPersonaje() {
        return new Villano();
    }

    @Override
    public Arma crearArma() {
        return new VaritaMagica();
    }
}
