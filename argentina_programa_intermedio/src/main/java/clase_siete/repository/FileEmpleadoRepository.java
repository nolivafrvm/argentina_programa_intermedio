package clase_siete.repository;

import clase_siete.entity.Empleado;

import java.util.List;

public class FileEmpleadoRepository implements EmpleadoRepository{
    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        System.out.println("Guardando el empleado en un archivo");
        return null;
    }

    @Override
    public Empleado obtenerEmpleadoPorId(Long empleadoId) {
        System.out.println("Obteniendo el empleado de un archivo");
        return null;
    }

    @Override
    public List<Empleado> obtenerEmpleadosPorNombre(String nombre) {
        System.out.println("Obtener los empleados por nombre");
        return null;
    }
}
