package App;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;


@Controller
public class AddressBookController {
    private AddressBookRepository addressBookRepository;

    public AddressBookController(AddressBookRepository addressBookRepository) {
        this.addressBookRepository = addressBookRepository;
    }

    @GetMapping("/addressBook")
    public String addressBook(Model model) {
        Iterable<AddressBook> addressBooks = this.addressBookRepository.findAll();
        model.addAttribute("addressBooks", addressBooks);
        return "addressBook";
    }

    @ResponseBody
    @PostMapping(value = "/createAddressBook", produces = "application/json")
    public AddressBook createAddressBook() {
        AddressBook a = new AddressBook();
        this.addressBookRepository.save(a);
        return a;
    }
}
