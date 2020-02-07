//import App.BuddyInfo;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//import java.util.List;
//
//
//public class BuddyInfoEntityTest {
//    public BuddyInfo buddy;
//
//    // Connecting the db
//    EntityManagerFactory emf;
//    EntityManager em;
//
//    @Before
//    public void setUp() throws Exception {
//        buddy =  new BuddyInfo( 1, "Foobar buddy", "123-123-1243", "123 foobar drive");
//        buddy.setId(1);
//
//        emf = Persistence.createEntityManagerFactory("jpa-test");
//        em = emf.createEntityManager();
//        EntityTransaction transaction = em.getTransaction();
//        transaction.begin();
//        em.persist(buddy);
//        transaction.commit();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        em.close();
//        emf.close();
//    }
//
//    @Test
//    public void buddyPersists(){
//        Query q = em.createQuery("SELECT buddy from App.BuddyInfo buddy");
//        List<BuddyInfo> results = q.getResultList();
//
//        assertEquals((long) 1, (long) results.get(0).getId());
//    }
//
//}
//
//
//
//
//
//
//
