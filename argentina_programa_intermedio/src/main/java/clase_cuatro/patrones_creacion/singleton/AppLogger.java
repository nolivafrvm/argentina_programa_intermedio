package clase_cuatro.patrones_creacion.singleton;

public class AppLogger {

    public static void main(String[] args) {
        Logger logger = Logger.getInstancia();

        // Registramos eventos
        logger.logEvento("Inicio de la aplicación");
        logger.logEvento("Error: Archivo no encontrado");
        logger.logEvento("Cierre de sesión");

        // Comprobamos que ambas referencias apuntan a la misma instancia
        Logger otroLogger = Logger.getInstancia();
        if (logger == otroLogger) {
            System.out.println("Ambas referencias apuntan al mismo Logger.");
        }
    }



}
