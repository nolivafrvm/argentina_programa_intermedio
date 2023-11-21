package clase_siete_act_patter_comb.strategy;

import clase_siete_act_patter_comb.entity.Empleado;
import clase_siete_act_patter_comb.repository.EmpleadoRepository;
import clase_siete_act_patter_comb.repository.JpaEmpleadoRepository;

import java.util.List;

public class JpaPersistenceStrategy implements PersistenceStrategy{
    private EmpleadoRepository jpaEmpleadoRepository;

    public JpaPersistenceStrategy(EmpleadoRepository jpaEmpleadoRepository) {
        this.jpaEmpleadoRepository = jpaEmpleadoRepository;
    }

    @Override
    public Empleado getById(Long id) {
        return jpaEmpleadoRepository.getById(id);
    }

    @Override
    public List<Empleado> getAll() {
        return jpaEmpleadoRepository.getAll();
    }

    @Override
    public void save(Empleado empleado) {
        jpaEmpleadoRepository.save(empleado);
    }

    @Override
    public void update(Empleado empleado) {
        jpaEmpleadoRepository.update(empleado);
    }

    @Override
    public void delete(Long id) {
        jpaEmpleadoRepository.delete(id);
    }
}
