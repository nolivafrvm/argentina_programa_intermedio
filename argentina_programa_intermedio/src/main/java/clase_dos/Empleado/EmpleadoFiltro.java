package clase_dos.Empleado;

@FunctionalInterface
public interface EmpleadoFiltro {

    boolean cumpleCondicion(Empleado empleado);
}
