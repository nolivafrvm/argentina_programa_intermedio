package clase_siete.repository.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDAO implements DAO{

    private static final String PERSISTENCE_UNIT_NAME = "JPA_PU";
    private final EntityManagerFactory entityManagerFactory;

    public JpaDAO() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

}
