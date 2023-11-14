package clase_cuatro.patrones_creacion.simple_factory;

public class AppFactorySimple {

    public static void main(String[] args) {

        Producto producto1 = FabricaSimple.crearProducto("A");
        producto1.operacion();

        Producto producto2 = FabricaSimple.crearProducto("B");
        producto2.operacion();

    }

}
