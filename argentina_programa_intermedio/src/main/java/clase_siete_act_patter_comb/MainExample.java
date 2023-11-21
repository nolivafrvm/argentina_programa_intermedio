package clase_siete_act_patter_comb;


import clase_siete_act_patter_comb.entity.Empleado;
import clase_siete_act_patter_comb.repository.EmpleadoRepository;
import clase_siete_act_patter_comb.repository.FileEmpleadoRepository;
import clase_siete_act_patter_comb.repository.JpaEmpleadoRepository;
import clase_siete_act_patter_comb.repository.dao.DAO;
import clase_siete_act_patter_comb.repository.dao.JpaDAO;
import clase_siete_act_patter_comb.strategy.FilePersistenceStrategy;
import clase_siete_act_patter_comb.strategy.JpaPersistenceStrategy;

public class MainExample {

    public static void main(String[] args) {
        DAO dao = new JpaDAO();
        EmpleadoRepository er = new JpaEmpleadoRepository(dao);

        JpaEmpleadoRepository jpaRepository = new JpaEmpleadoRepository(dao);
        FileEmpleadoRepository fileRepository = new FileEmpleadoRepository();

        EmpleadoService empleadoService = new EmpleadoService(new JpaPersistenceStrategy(jpaRepository));


        // Uso del repositorio con estrategia JPA
        Empleado empleado = empleadoService.getById(1L);
        System.out.println(empleado);

        // Cambiar dinámicamente a la estrategia de archivo
        empleadoService.setPersistenceStrategy(new FilePersistenceStrategy(fileRepository));
        Empleado empleadoFromFile = empleadoService.getById(2L);
        System.out.println(empleadoFromFile);

    }


}
