package guru.springframework.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

@Service
public interface RandomJokesService {

    String getRandomJoke();
}
