package clase_siete_act_patter_comb.strategy;

import clase_siete_act_patter_comb.entity.Empleado;

import java.util.List;

public interface PersistenceStrategy {
    Empleado getById(Long id);
    List<Empleado> getAll();
    void save(Empleado empleado);
    void update(Empleado empleado);
    void delete(Long id);
}
