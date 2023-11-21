package clase_siete.repository;


import clase_siete.entity.Empleado;
import clase_siete.repository.dao.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class JpaEmpleadoRepository implements EmpleadoRepository {
    private final DAO dao;

    public JpaEmpleadoRepository(DAO dao) {
        this.dao = dao;
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        EntityManager entityManager = dao.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(empleado);
            transaction.commit();
            return empleado;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return null;
    }

    @Override
    public Empleado obtenerEmpleadoPorId(Long empleadoId) {
        EntityManager entityManager = dao.getEntityManager();
        try {
            return entityManager.find(Empleado.class, empleadoId);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Empleado> obtenerEmpleadosPorNombre(String nombre) {
        EntityManager entityManager = dao.getEntityManager();
        try {
            String jpql = "SELECT e FROM Empleado e WHERE e.nombre = :nombre";
            Query query = entityManager.createQuery(jpql, Empleado.class);
            query.setParameter("nombre", nombre);

            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    public List<Empleado> obtenerEmpleadosPorNombreCriteria(String nombre) {
        EntityManager entityManager = dao.getEntityManager();
        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Empleado> criteriaQuery = criteriaBuilder.createQuery(Empleado.class);
            Root<Empleado> root = criteriaQuery.from(Empleado.class);

            criteriaQuery.where(criteriaBuilder.equal(root.get("nombre"), nombre));

            return entityManager.createQuery(criteriaQuery).getResultList();
        } finally {
            entityManager.close();
        }
    }

}