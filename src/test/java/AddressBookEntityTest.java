//import App.AddressBook;
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
//public class AddressBookEntityTest {
//    public AddressBook book;
//
//    // Connecting the db
//    EntityManagerFactory emf;
//    EntityManager em;
//
//    @Before
//    public void setUp() throws Exception {
//        book = new AddressBook();
//        book.setId(123);
//
//
//        book.add(new BuddyInfo(1, "Foobar buddy 1", "123-123-1243", "123 foobar drive 1"));
//        book.add(new BuddyInfo(2, "Foobar buddy 2", "123-123-1243", "123 foobar drive 2"));
//        book.add(new BuddyInfo(3, "Foobar buddy 3", "123-123-1243", "123 foobar drive 3"));
//
//        emf = Persistence.createEntityManagerFactory("jpa-test");
//        em = emf.createEntityManager();
//
//        EntityTransaction transaction = em.getTransaction();
//        transaction.begin();
//        em.persist(book);
//
//        for(BuddyInfo buddy: book.getBuddies()) {
//            em.persist(buddy);
//        }
//
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
//    public void testAddressBookQuery() throws Exception {
//        Query q = em.createQuery("SELECT addressBook from App.AddressBook addressBook");
//        List<AddressBook> results = q.getResultList();
//
//        assertEquals((long)123, (long)results.get(0).getId());
//    }
//
//
//    @Test
//    public void testAddressBookBuddiesQuery() throws Exception {
//        Query q = em.createQuery("SELECT buddy from App.BuddyInfo buddy");
//        List<BuddyInfo> results = q.getResultList();
//
//        assertEquals((long) 3, (long) results.size());
//    }
//}
//
//
//
//
//
//
//
