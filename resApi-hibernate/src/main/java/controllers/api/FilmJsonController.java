package controllers.api;

import converters.FilmConverter;
import dto.FilmDto;
import models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import services.AfishaService;


import java.util.ArrayList;
import java.util.List;

/**
 * 29.05.2017
 * FilmJsonController @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
@Controller
public class FilmJsonController {
    @Autowired
    AfishaService afishaService;

    @RequestMapping(value = "/anatation/films/json", method =  RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<FilmDto> getAllFilms(){
        List<Film> films = afishaService.findAll();
        List<FilmDto> filmDtoList = FilmConverter.convertListFilm(films);
        return filmDtoList;
    }

}
