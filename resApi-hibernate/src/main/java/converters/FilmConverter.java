package converters;

import dto.ActorDto;
import dto.FilmDto;
import dto.GenreDto;
import models.Actor;
import models.Film;
import models.Genre;

import java.util.ArrayList;
import java.util.List;

/**
 * 29.05.2017
 * FilmConverter @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
public class FilmConverter {
    public static FilmDto convert(Film film){

        FilmDto filmDto = new FilmDto.Builder()
                .id(film.getId())
                .name(film.getName())
                .releaseDate(film.getReleaseDate())
                .country(film.getCountry())
                .producer(film.getProducer())
                .lasting(film.getLasting())
                .description(film.getDescription())
                .actors(convertListActors(film.getActors()))
                .genre(convertListGenres(film.getGenres()))
                .build();
        return filmDto;
    }

    public static List<ActorDto> convertListActors(List<Actor> actors){
        List<ActorDto> actorsDto = new ArrayList<ActorDto>();
        for(Actor actor: actors){
            ActorDto actorDto = new ActorDto.Builder()
                    .id(actor.getId())
                    .filmId(actor.getFilmId())
                    .actorName(actor.getActorName())
                    .build();
            actorsDto.add(actorDto);
        }
        return actorsDto;
    }

    public static List<GenreDto> convertListGenres(List<Genre> genres){
        List<GenreDto> genresDto = new ArrayList<>();
        for(Genre genre: genres){
            GenreDto newGenre = new GenreDto.Builder()
                    .id(genre.getId())
                    .filmId(genre.getFilmId())
                    .genre(genre.getGenre())
                    .build();
            genresDto.add(newGenre);
        }
        return genresDto;
    }
    public static List<FilmDto> convertListFilm(List<Film> films){
        List<FilmDto> filmsDto = new ArrayList<>();
        for(Film film: films){
            filmsDto.add(convert(film));
        }
        return filmsDto;
    }
}
