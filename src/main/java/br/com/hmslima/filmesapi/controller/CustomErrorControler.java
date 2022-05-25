package br.com.hmslima.filmesapi.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorControler implements ErrorController {

    @RequestMapping("/error")
    public ModelAndView errorPage() {
        ModelAndView modelAndView = new ModelAndView("redirect:/filmes");

        return modelAndView;
    }
}
