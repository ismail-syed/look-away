import App.AddressBook;
import App.BuddyInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AddressBookTest {

    private AddressBook book;

    @Before
    public void setUp(){
        book = new AddressBook();
    }

    @After
    public void tearDown(){ }

    @Test
    public void add(){
        BuddyInfo bud = new BuddyInfo();
        book.add(bud);

        assert(book.contains(bud));
    }

    @Test
    public void remove() {
        BuddyInfo bud = new BuddyInfo();
        book.add(bud);
        book.remove(bud);

        assert (!book.contains(bud));
    }

}
