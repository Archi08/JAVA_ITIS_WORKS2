package ru.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itis.models.Film;
import ru.itis.services.AfishaService;

import java.util.List;

/**
 * 02.06.2017
 * FilmsController
 *
 * @author Ayupov Ayaz (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class FilmsController {

    @Autowired
    private AfishaService afishaService;


   @RequestMapping(value = "/films/{id}",method = RequestMethod.GET)
    public String getFilm(@ModelAttribute("model") ModelMap model, @PathVariable("id") int filmId){
        List<Film> films = afishaService.findAll();
        Film film = films.get(filmId);
        model.addAttribute("filmsModel",film);
        return "film";
    }
    @RequestMapping(value = "/films/all", method = RequestMethod.GET)
    public String getAll(@ModelAttribute("model") ModelMap model){
        List<Film> films = afishaService.findAll();
        model.addAttribute("filmsModel",films);
        return "filmsView";
    }

}
