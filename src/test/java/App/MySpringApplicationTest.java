package App;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;


@SpringBootTest
@AutoConfigureMockMvc
class MySpringApplicationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void fullSystemTest() throws Exception {
        this.mockMvc.perform(post("/createAddressBook")).andExpect(status().isOk());

        this.mockMvc.perform(get("/addressBook").param("id", "1"))
                .andExpect(content().string(containsString("No buddies")));

        this.mockMvc.perform(post("/newBuddyInfo")
                .param("id", "1")
                .param("addressBookId", "1")
                .param("name", "buddy1")
                .param("number", "123")
                .param("address", "123 drive")
        ).andExpect(status().isOk());

        this.mockMvc.perform(post("/newBuddyInfo")
                .param("id", "2")
                .param("addressBookId", "1")
                .param("name", "buddy2")
                .param("number", "12345")
                .param("address", "12345 drive")
        ).andExpect(status().isOk());

        this.mockMvc.perform(get("/addressBook").param("id", "1"))
                .andExpect(content().string(containsString("buddy1")))
                .andExpect(content().string(containsString("buddy2")));

        this.mockMvc.perform(post("/deleteBuddyInfo")
                .param("id", "2"))
                .andExpect(status().isOk());

        this.mockMvc.perform(get("/addressBook").param("id", "1"))
                .andExpect(content().string(not(containsString("buddy2"))))
                .andExpect(content().string(containsString("buddy1")));
    }
}