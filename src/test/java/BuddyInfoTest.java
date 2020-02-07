import App.BuddyInfo;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class BuddyInfoTest {
    private BuddyInfo buddy;

    @Before
    public void setUp() {
        buddy = new BuddyInfo();
        buddy.setName("foo");
        buddy.setAddress("bar");
        buddy.setCell("123");
    }

    @After
    public void tearDown() {
    }


    @Test
    public void getName() {
        assert(buddy.getName().equals("foo"));
    }

    @Test
    public void getAddress() {
        assert(buddy.getAddress().equals("bar"));
    }

    @Test
    public void getPhone() {
        assert(buddy.getCell().equals("123"));
    }

    @Test
    public void setName() {
        buddy.setName("foo2");
        assert(buddy.getName().equals("foo2"));
    }

    @Test
    public void setAddress() {
        buddy.setAddress("bar2");
        assert(buddy.getAddress().equals("bar2"));
    }

    @Test
    public void setCell() {
        buddy.setCell("12345");
        assert(buddy.getCell().equals("12345"));
    }

    @Test
    public void testToString() {
        assert(buddy.toString().equals("foo : 123 : bar"));
    }
}