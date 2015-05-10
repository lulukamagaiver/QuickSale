package quick.sale;

import controle.CliForDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelos.CliFor;
import modelos.TipoPessoa;

/**
 *
 * @author Marcus Vinicius
 */
public class QuickSale {

    /**
     * @param args Inicial
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        CliFor cf = new CliFor();
        cf.setNomeFantasia("MVSistemas");
        cf.setRazaoCompleto("Marcus Vinicius ME");
        cf.setCpfCnpj("024.815.054-50");
        cf.setIeRg("1.718.808");
        cf.setDataCadastro(null);
        cf.setPessoa(TipoPessoa.F);
        
        try {
            EntityManagerFactory factory = 
                    Persistence.createEntityManagerFactory("Quick_SalePU");
            EntityManager entityManager = factory.createEntityManager();
            
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(cf);
            transaction.commit();
            factory.close();
            entityManager.close();
        } catch (Exception e) {
            e.getMessage();
        }
        
        
//        CliForDAO dao = new CliForDAO();
//        dao.salvaAlteraCliFor(cf);
//        
    }
    
}
