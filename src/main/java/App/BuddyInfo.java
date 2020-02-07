package App;


import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class BuddyInfo {

    @Id
    private Integer id = null;
    private String name, address, cell;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private AddressBook addressBook;

    public BuddyInfo() {}

    public BuddyInfo(Integer id, String name, String cell, String address) {
        this.id = id;
        this.name = name;
        this.cell = cell;
        this.address = address;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getCell() { return cell; }

    public void setName(String n) { name = n; }
    public void setAddress(String a) { address = a; }
    public void setCell(String c) { cell = c; }

    public AddressBook getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public String toString(){
        return name + " : " + cell + " : " + address;
    }
}
