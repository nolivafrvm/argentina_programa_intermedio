package clase_siete_act_patter_comb.service;


import clase_siete_act_patter_comb.entity.Empleado;
import clase_siete_act_patter_comb.repository.EmpleadoRepository;
import clase_siete_act_patter_comb.strategy.PersistenceStrategy;

import java.util.List;

public class EmpleadoService {

    private PersistenceStrategy persistenceStrategy;

    public EmpleadoService(PersistenceStrategy persistenceStrategy) {
        this.persistenceStrategy = persistenceStrategy;
    }

    public void guardarEmpleado(Empleado empleado) {
        persistenceStrategy.save(empleado);
    }

    public Empleado getById(Long empleadoId) {
        return persistenceStrategy.getById(empleadoId);
    }

    public List<Empleado> getAll(String nombre) {
        return persistenceStrategy.getAll();
    }

    public void setPersistenceStrategy(PersistenceStrategy persistenceStrategy) {
        this.persistenceStrategy = persistenceStrategy;
    }

}
