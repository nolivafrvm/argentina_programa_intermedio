package clase_siete_act_patter_comb.repository;

import clase_siete_act_patter_comb.entity.Empleado;
import clase_siete_act_patter_comb.repository.dao.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class JpaEmpleadoRepository implements EmpleadoRepository {
    private final DAO dao;

    public JpaEmpleadoRepository(DAO dao) {
        this.dao = dao;
    }

    @Override
    public void save(Empleado empleado) {
        System.out.println("salvando el empleado desde la base");
        EntityManager entityManager = dao.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(empleado);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

    }

    @Override
    public void update(Empleado empleado) {
        System.out.println("actualizando el empleado desde la base");
    }

    @Override
    public void delete(Long id) {
        System.out.println("deleteando el empleado desde la base");
    }

    @Override
    public Empleado getById(Long empleadoId) {
        System.out.println("trayendo el empleado desde la base");
        EntityManager entityManager = dao.getEntityManager();
        try {
            return entityManager.find(Empleado.class, empleadoId);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Empleado> getAll() {
        System.out.println("trayendo todos los empleados desde la base");
        return null;
    }


}