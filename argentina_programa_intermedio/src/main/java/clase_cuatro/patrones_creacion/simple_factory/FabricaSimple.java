package clase_cuatro.patrones_creacion.simple_factory;

public class FabricaSimple {

    public static Producto crearProducto(String tipo) {
        if (tipo.equals("A")) {
            return new ProductoA();
        } else if (tipo.equals("B")) {
            return new ProductoB();
        } else {
            throw new IllegalArgumentException("Tipo de producto desconocido");
        }
    }

}
