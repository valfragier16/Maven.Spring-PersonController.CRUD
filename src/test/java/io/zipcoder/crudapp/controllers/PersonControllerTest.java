package io.zipcoder.crudapp.controllers;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.repositories.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class PersonControllerTest {

    @Autowired
    private MockMvc mvc;


    @MockBean
    private PersonRepository repository;

//    @Test
//    public void testShow() throws Exception {
//        Long givenId = 1L;
//        BDDMockito
//                .given(repository.findById(givenId))
//                .willReturn(Optional.of(new Person(1, "Valerie", "Fragier")));
//
//        String expectedContent = "{\"id\":null,\"name\":\"New Baker!\",\"employeeId\":null,\"specialty\":null}";
//        this.mvc.perform(MockMvcRequestBuilders
//                .get("/bakers/" + givenId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
//    }

//    @Test
//    public void testCreate() throws Exception {
//        Person person = new Person(null, null, null);
//        BDDMockito
//                .given(repository.save(person))
//                .willReturn(person);
//
//        String expectedContent="{\"id\":null,\"name\":\"Justin\",\"Hubschmitt\"}";
//        this.mvc.perform(MockMvcRequestBuilders
//                .post("/people")
//                .content(expectedContent)
//                .accept(MediaType.APPLICATION_JSON)
//                .contentType(MediaType.APPLICATION_JSON)
//        )
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
//    }
}
