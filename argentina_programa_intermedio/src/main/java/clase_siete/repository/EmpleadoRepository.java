package clase_siete.repository;

import clase_siete.entity.Empleado;

import java.util.List;

public interface EmpleadoRepository {
    Empleado guardarEmpleado(Empleado empleado);
    Empleado obtenerEmpleadoPorId(Long empleadoId);
    List<Empleado> obtenerEmpleadosPorNombre(String nombre);
}
