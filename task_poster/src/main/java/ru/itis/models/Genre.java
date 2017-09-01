package ru.itis.models;

import javax.persistence.*;

/**
 * 29.05.2017
 * Genre
 *
 * @author Ayupov Ayaz (First Software Engineering Platform)
 * @version v1.0
 */
@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String genre;

    @ManyToOne
    @JoinColumn(name = "id_film")
    private Film idFilm;

    public Genre() {
    }

    public Genre(Builder builder){
        this.id = builder.id;
        this.genre = builder.genre;
        this.idFilm =  builder.film;
    }
    public static class Builder{
        private int id;
        private String genre;
        private Film film;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder genre(String genre){
            this.genre = genre;
            return this;
        }
        public Builder idFilm(Film film){
            this.film = film;
            return this;
        }
        public Genre build(){
            return new Genre(this);
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Film getIdFilm() {
        return this.idFilm;
    }

    public void setIdFilm(Film film) {
        this.idFilm = film;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
