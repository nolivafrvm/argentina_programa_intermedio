package clase_cuatro.patrones_creacion.factory_method;

public class FactoryCuadrado implements FactoryFigura{

    @Override
    public Figura crearFigura() {
        return new Cuadrado();
    }
}
