package clase_siete.service;

import clase_siete.entity.Empleado;
import clase_siete.repository.EmpleadoRepository;

import java.util.List;

public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.guardarEmpleado(empleado);
    }

    public Empleado obtenerEmpleadoPorId(Long empleadoId) {
        return empleadoRepository.obtenerEmpleadoPorId(empleadoId);
    }

    public List<Empleado> obtenerEmpleadosPorNombre(String nombre) {
        return empleadoRepository.obtenerEmpleadosPorNombre(nombre);
    }

}
