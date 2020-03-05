package gadde.jokes.controllers;

import gadde.jokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JavaController {
    private final JokeService jokeService;

    public JavaController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
@RequestMapping({"/joke","","/"})
    public String showJoke(Model model){
    model.addAttribute("joke",jokeService.getJoke());
        return  "chucknorris";
    }
}
