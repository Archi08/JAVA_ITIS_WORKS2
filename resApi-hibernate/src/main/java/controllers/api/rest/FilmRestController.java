package controllers.api.rest;

import converters.FilmConverter;
import dto.FilmDto;
import models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.AfishaService;

import java.util.List;

/**
 * 29.05.2017
 * FilmRestController @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
@RestController
public class FilmRestController {
    @Autowired
    AfishaService afishaService;

    @GetMapping(value ="films/{actorName}/inGenre", params = "filter = genre")
    public List<FilmDto> getFilmsByActorInGenre(@PathVariable("actorName") String actorName,
                                                @RequestParam("genre") String genre){
        List<Film> films = afishaService.findByActorInGenre(actorName,genre);
        List<FilmDto> filmsDto = FilmConverter.convertListFilm(films);
        return filmsDto;
    }

}
