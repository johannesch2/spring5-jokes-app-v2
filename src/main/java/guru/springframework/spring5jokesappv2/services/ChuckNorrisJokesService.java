package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesService implements RandomJokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
