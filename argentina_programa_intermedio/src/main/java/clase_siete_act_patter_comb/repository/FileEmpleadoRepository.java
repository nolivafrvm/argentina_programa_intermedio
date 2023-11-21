package clase_siete_act_patter_comb.repository;

import clase_siete_act_patter_comb.entity.Empleado;

import java.util.List;

public class FileEmpleadoRepository implements EmpleadoRepository{

    @Override
    public Empleado getById(Long id) {
        System.out.println("Trayendo el empleado desde el file");
        return null;
    }

    @Override
    public List<Empleado> getAll() {
        System.out.println("Trayendo todos los empleados desde el file");
        return null;
    }

    @Override
    public void save(Empleado empleado) {

        System.out.println("guardando el empleado desde file");
    }

    @Override
    public void update(Empleado empleado) {

        System.out.println("actualizando el empleado desde el file");
    }

    @Override
    public void delete(Long id) {

        System.out.println("deleteando el empleado desde el file");
    }
}
