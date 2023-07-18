package guru.springframework.spring5jokesappv2.services;

import org.springframework.stereotype.Component;

@Component
public interface RandomJokesService {

    public String getRandomJoke();
}
