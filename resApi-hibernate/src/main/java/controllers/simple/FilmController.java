package controllers.simple;



import models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import services.AfishaService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 29.05.2017
 * FilmJsonController @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
@Component
public class FilmController implements Controller {

    @Autowired
    private AfishaService afishaService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        if(httpServletRequest.getMethod().equals("GET")){
            ModelAndView result = new ModelAndView("filmsView");
            List<Film> films = afishaService.findAll();
            result.addObject("filmsModel",films);
            return result;
        }else throw new IllegalArgumentException("BAD REQUEST");
    }
}
