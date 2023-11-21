package clase_siete_act_patter_comb.service;


import clase_siete_act_patter_comb.entity.Empleado;
import clase_siete_act_patter_comb.repository.EmpleadoRepository;

import java.util.List;

public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public void guardarEmpleado(Empleado empleado) {
         empleadoRepository.save(empleado);
    }

    public Empleado obtenerEmpleadoPorId(Long empleadoId) {
        return empleadoRepository.getById(empleadoId);
    }

    public List<Empleado> getAll() {
        return empleadoRepository.getAll();
    }

}
