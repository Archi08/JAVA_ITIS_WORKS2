package controllers.annotation;

import models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import services.AfishaService;

import java.util.List;

/**
 * 29.05.2017
 * FilmsController @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
@Controller("filmsControllerAnnotation")
public class FilmsController {

    @Autowired
    AfishaService afishaService;

    @RequestMapping(value = "films/all/jsp", method = RequestMethod.GET)
    public ModelAndView getAll(){
        ModelAndView result = new ModelAndView("filmsView");
        List<Film> films = afishaService.findAll();
        result.addObject("filmsModel");
        return result;
    }
    @RequestMapping(value = "films/all/ftl",method = RequestMethod.GET)
    public String getAll(@ModelAttribute("model")ModelMap model){
        List<Film> films = afishaService.findAll();
        model.addAttribute("filmsModel",films);
        return "filmsView";
    }
}
