package clase_siete_act_patter_comb.repository;

import clase_siete_act_patter_comb.entity.Empleado;

import java.util.List;

public interface EmpleadoRepository {
    Empleado getById(Long id);
    List<Empleado> getAll();
    void save(Empleado empleado);
    void update(Empleado empleado);
    void delete(Long id);
}
