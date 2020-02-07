package App;

import App.BuddyInfo;

import java.util.Collection;
import java.util.ArrayList;
import javax.persistence.*;

@Entity
public class AddressBook {
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<BuddyInfo> buddies;

    @Id
    @GeneratedValue
    private Integer id = null;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public void add(BuddyInfo buddy) {
        buddy.setAddressBook(this);
        buddies.add(buddy);
    }

    public void remove(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public boolean contains(BuddyInfo buddy) {
        return buddies.contains(buddy);
    }

    public Collection<BuddyInfo> getBuddies() {
        return buddies;
    }

    public String toString() {
        String buddies = "";
        for (BuddyInfo buddy: this.buddies) {
            buddies += "\n" + buddy.toString() ;
        }
        return buddies;
    }


//    public static void main(String[] args) {
//        App.AddressBook myAddressBook = new App.AddressBook();
//
//        App.BuddyInfo bud1 = new App.BuddyInfo();
//        bud1.setName("Arun");
//        bud1.setAddress("123 foobar");
//        bud1.setCell("cell 1");
//
//        App.BuddyInfo bud2 = new App.BuddyInfo();
//        bud2.setName("Kunal");
//        bud2.setAddress("2 bar");
//        bud2.setCell("cell 2");
//
//        App.BuddyInfo bud3 = new App.BuddyInfo();
//        bud3.setName("Sean");
//        bud3.setAddress("2 baz");
//        bud3.setCell("cell 3");
//
//        myAddressBook.add(bud1);
//        myAddressBook.add(bud2);
//        myAddressBook.add(bud3);
//
//        System.out.println(myAddressBook.toString());
//    }

}

