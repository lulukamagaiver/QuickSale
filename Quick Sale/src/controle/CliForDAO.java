package controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelos.CliFor;

/**
 * @author Marcus Vinicius Classe utilizada para fazer realizar as operações de
 * banco de dados sobre a entity Pessoa.
 */
public class CliForDAO {

    public EntityManager getEntityManager() {
        EntityManager entityManager = null;
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("Quick_SalePU");
            entityManager = factory.createEntityManager();
         
        } catch (Exception e) {
            e.getMessage();
        }     
       // factory.close();
        return entityManager;
    }

    public void salvaAlteraCliFor(CliFor clifor) {
        try {
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        getEntityManager().persist(clifor);
        transaction.commit();
        
        } catch (Exception e) {
            e.getMessage();
        }
        
    }

}
