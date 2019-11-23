package pro.zoltanfekete.chucknorrisjokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pro.zoltanfekete.chucknorrisjokeapp.services.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }
}
