package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.ChuckNorrisJokesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(JokesController.class)
class JokesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ChuckNorrisJokesService chuckNorrisJokesService;

    @Test
    void getRandomJoke() throws Exception {
        when(chuckNorrisJokesService.getRandomJoke()).thenReturn("What a joke!");
        this.mockMvc.perform((get("/"))).andDo(print()).andExpect((status().isOk()))
                .andExpect(content().string(containsString("What a joke!")));
    }
}