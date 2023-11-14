package clase_cuatro.patrones_creacion.factory_method;

public class AppFactoryMethod {

    public static void main(String[] args) {
        FactoryFigura fabrica = new FactoryCirculo();
        Figura figura = fabrica.crearFigura();
        figura.dibujar();

        fabrica = new FactoryCuadrado();
        figura = fabrica.crearFigura();
        figura.dibujar();
    }

}
