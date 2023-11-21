package clase_siete_act_patter_comb;


import clase_siete_act_patter_comb.entity.Empleado;
import clase_siete_act_patter_comb.repository.EmpleadoRepository;
import clase_siete_act_patter_comb.repository.FileEmpleadoRepository;
import clase_siete_act_patter_comb.repository.JpaEmpleadoRepository;
import clase_siete_act_patter_comb.repository.dao.DAO;
import clase_siete_act_patter_comb.repository.dao.JpaDAO;
import clase_siete_act_patter_comb.service.EmpleadoService;
import clase_siete_act_patter_comb.strategy.FilePersistenceStrategy;
import clase_siete_act_patter_comb.strategy.JpaPersistenceStrategy;

public class MainExample {

    public static void main(String[] args) {
        DAO dao = new JpaDAO();
        EmpleadoRepository empleadoRepository = new JpaEmpleadoRepository(dao);

        EmpleadoService empleadoService = new EmpleadoService(new JpaPersistenceStrategy(empleadoRepository));

        Empleado emp = new Empleado();
        emp.setId(1L);
        emp.setNombre("Jose");
        empleadoService.guardarEmpleado(emp);

        // Uso del repositorio con estrategia JPA
        Empleado empleado = empleadoService.getById(1L);
        System.out.println(empleado.getNombre());

        // Cambiar dinámicamente a la estrategia de archivo
        empleadoRepository = new FileEmpleadoRepository();
        empleadoService.setPersistenceStrategy(new FilePersistenceStrategy(empleadoRepository));
        Empleado empleadoFromFile = empleadoService.getById(2L);
        System.out.println(empleadoFromFile);

    }


}
