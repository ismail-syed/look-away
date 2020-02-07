package App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringApp {

    private static final Logger log = LoggerFactory.getLogger(SpringApp.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class);
//        SpringApplication.run(ServingWebContentApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(AddressBookRepository addressBookRepo, BuddyInfoRepository buddyRepo) {
        return (args) -> {
        };
    }
}