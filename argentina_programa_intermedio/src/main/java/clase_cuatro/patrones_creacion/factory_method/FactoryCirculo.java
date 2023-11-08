package clase_cuatro.patrones_creacion.factory_method;

public class FactoryCirculo implements FactoryFigura{

    @Override
    public Figura crearFigura() {
        return new Circulo();
    }

}
