package ru.itis.models;

import javax.persistence.*;
import java.util.List;

/**
 * 08.05.2017
 * Film @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column(name = "release_date")
    private String releaseDate;

    @OneToMany(mappedBy = "idFilm")
    private List <Genre> genres;

    @Column
    private String country;

    @Column
    private String producer;

    @Column
    private int lasting;

    @Column
    private String description;

    @OneToMany(mappedBy = "idFilm")
    private List <Actor> actors;

    @Column
    private String picture;


    public Film() {
    }

    public Film(Builder builder){
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
        private List<Genre> genre;
        private String country;
        private String producer;
        private int lasting;
        private String description;
        private List<Actor> actors;
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
        public Builder genre(List<Genre> genre){
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
        public Builder actors(List<Actor> actors){
            this.actors = actors;
            return this;
        }
        public Builder picture(String picture){
            this.picture = picture;
            return this;
        }
        public Film build(){
            return new Film(this);
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setLasting(int lasting) {
        this.lasting = lasting;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public String getCountry() {
        return country;
    }

    public String getProducer() {
        return producer;
    }

    public int getLasting() {
        return lasting;
    }

    public String getDescription() {
        return description;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public String getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return  id +
                " " + name +
                " " + releaseDate +
                " " + genres +
                " " + country +
                " " + producer +
                " " + lasting +
                " " + description +
                " " + actors +
                " " + picture;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null || obj instanceof Film){
            if(obj == this) return true;
            Film that = (Film) obj;
            return this.id == that.id
                    && this.name.equals(that.name)
                    && this.genres.equals(that.genres)
                    && this.actors.equals(that.actors)
                    && this.country.equals(that.country)
                    && this.description.equals(that.description)
                    && this.lasting == that.lasting
                    && this.producer.equals(that.producer)
                    && this.picture.equals(that.picture)
                    && this.releaseDate.equals(that.releaseDate);
        }return false;
    }
}