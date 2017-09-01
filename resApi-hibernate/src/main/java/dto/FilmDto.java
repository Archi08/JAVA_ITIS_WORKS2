package dto;

import models.Actor;
import models.Genre;

import java.util.List;

/**
 * 29.05.2017
 * FilmDto @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
public class FilmDto {
    private int id;
    private String name;
    private String releaseDate;
    private List<GenreDto> genres;
    private String country;
    private String producer;
    private int lasting;
    private String description;
    private List <ActorDto> actors;
    private String picture;


    public FilmDto(){}

    public FilmDto(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.releaseDate = builder.releaseDate;
        this.genres = builder.genre;
        this.country = builder.country;
        this.producer = builder.producer;
        this.lasting = builder.lasting;
        this.description = builder.description;
        this.actors = builder.actors;
        this.picture = builder.picture;
    }

    public static class Builder{
        private int id;
        private String name;
        private String releaseDate;
        private List<GenreDto> genre;
        private String country;
        private String producer;
        private int lasting;
        private String description;
        private List<ActorDto> actors;
        private String picture;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder releaseDate(String releaseDate){
            this.releaseDate = releaseDate;
            return this;
        }
        public Builder genre(List<GenreDto> genre){
            this.genre = genre;
            return this;
        }
        public Builder country(String country){
            this.country = country;
            return this;
        }
        public Builder producer(String producer){
            this.producer = producer;
            return this;
        }
        public Builder lasting(int lasting){
            this.lasting = lasting;
            return this;
        }
        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder actors(List<ActorDto> actors){
            this.actors = actors;
            return this;
        }
        public Builder picture(String picture){
            this.picture = picture;
            return this;
        }
        public FilmDto build(){
            return new FilmDto(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<GenreDto> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreDto> genres) {
        this.genres = genres;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getLasting() {
        return lasting;
    }

    public void setLasting(int lasting) {
        this.lasting = lasting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ActorDto> getActorDto() {
        return actors;
    }

    public void setActorsDto(List<ActorDto> actors) {
        this.actors = actors;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
