import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        Session session = configuration.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

/*        TesterEntity testerEntity = new TesterEntity();
        testerEntity.setId(1);
        testerEntity.setName("ABC");
        testerEntity.setAddress("B M N");

        session.persist(testerEntity);
        System.out.println("Persisted");*/

        System.out.println(session.createQuery("from TesterEntity").getSingleResult().toString());

        transaction.commit();
        session.close();

    }

}
