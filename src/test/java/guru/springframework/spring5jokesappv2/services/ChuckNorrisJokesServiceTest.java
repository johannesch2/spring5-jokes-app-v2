package guru.springframework.spring5jokesappv2.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChuckNorrisJokesServiceTest {

    final private RandomJokesService randomJokesService = new ChuckNorrisJokesService();

    @Test
    void getRandomJoke() {
        assertNotNull(randomJokesService.getRandomJoke());
        assertEquals(String.class, randomJokesService.getRandomJoke().getClass());
    }
}