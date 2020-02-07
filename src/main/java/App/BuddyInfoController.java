package App;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BuddyInfoController {
    private AddressBookRepository addressBookRepository;
    private BuddyInfoRepository buddyInfoRepository;

    public BuddyInfoController(AddressBookRepository addressBookRepository, BuddyInfoRepository buddyInfoRepository) {
        this.addressBookRepository = addressBookRepository;
        this.buddyInfoRepository = buddyInfoRepository;
    }

    @ResponseBody
    @PostMapping(value = "/newBuddyInfo", produces = "application/json")
    public BuddyInfo newBuddyInfo(@RequestParam("addressBookId") Integer addressBookId, @RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("number") String number, @RequestParam("address") String address, Model model) {
        AddressBook addressBook = this.addressBookRepository.findById(addressBookId);
        BuddyInfo buddy = new BuddyInfo(id, name, number, address);
        this.buddyInfoRepository.save(buddy);

        addressBook.add(buddy);
        this.addressBookRepository.save(addressBook);

        return buddy;
    }

    @ResponseBody
    @PostMapping(value = "/deleteBuddyInfo", produces = "application/json")
    @Transactional
    public void deleteBuddyInfo(@RequestParam("id") Integer id) {
        BuddyInfo buddy = this.buddyInfoRepository.findById(id);
        AddressBook addressBook = buddy.getAddressBook();
        addressBook.remove(buddy);
        this.buddyInfoRepository.deleteById(id);
        this.addressBookRepository.save(addressBook);
    }
}
