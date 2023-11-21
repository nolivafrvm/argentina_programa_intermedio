package clase_siete;

import clase_siete.entity.Empleado;
import clase_siete.repository.EmpleadoRepository;
import clase_siete.repository.FileEmpleadoRepository;
import clase_siete.repository.JpaEmpleadoRepository;
import clase_siete.repository.dao.DAO;
import clase_siete.repository.dao.JpaDAO;
import clase_siete.service.EmpleadoService;

public class MainExample {

    public static void main(String[] args) {
        DAO dao = new JpaDAO();
        EmpleadoRepository empleadoRepository = new JpaEmpleadoRepository(dao);
        EmpleadoRepository empleadoRepository_file = new FileEmpleadoRepository();
        EmpleadoService empleadoService = new EmpleadoService(empleadoRepository_file);


        Empleado emp = new Empleado();
        emp.setId(1L); // L -> Long
        emp.setNombre("Nico");
        empleadoService.guardarEmpleado(emp);

//        empleadoService.setEmpleadoRepository(empleadoRepository_file);

        Empleado empRet = empleadoService.obtenerEmpleadoPorId(1L);
        System.out.println(empRet.getNombre());


    }

//    public static EntityManager getEntityManager(){
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
//        EntityManager manager = factory.createEntityManager();
//        return manager;
//    }
//    public static void main(String[] args) {
//        EntityManager em = getEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        Empleado empleado = new Empleado(); //← Seteamos todos los atributos
//
//        em.persist(empleado);
//        tx.commit();
//    }

}
