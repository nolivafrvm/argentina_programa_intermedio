package clase_cuatro.patrones_creacion.singleton;

public class Logger {

    private static Logger instancia;

    private Logger() {

    }

    // Método público para obtener la instancia única del Logger
    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    // Método para registrar un evento
    public void logEvento(String mensaje) {
        System.out.println("Evento: " + mensaje);
    }


}
