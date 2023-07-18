package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.domain.Joke;
import guru.springframework.spring5jokesappv2.services.RandomJokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final RandomJokesService randomJokesService;

    public JokesController(RandomJokesService randomJokesService) {
        this.randomJokesService = randomJokesService;
    }

    @RequestMapping({"/", ""})
    public final String getRandomJoke(Model model) {
        model.addAttribute("joke", new Joke(randomJokesService.getRandomJoke()));
        return "index";
    }
}
