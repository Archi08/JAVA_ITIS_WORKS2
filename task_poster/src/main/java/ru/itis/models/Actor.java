package ru.itis.models;

import javax.persistence.*;

/**
 * 29.05.2017
 * Actor
 *
 * @author Ayupov Ayaz (First Software Engineering Platform)
 * @version v1.0
 */
@Entity
@Table(name = "actors")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "actor_name")
    private String actorName;

    @ManyToOne
    @JoinColumn(name = "id_film")
    private Film idFilm;

    public Actor(Builder builder){
        this.id = builder.id;
        this.actorName = builder.actorName;
        this.idFilm = builder.idFilm;
    }

    public Actor() {
    }


    public static class Builder{
        private int id;
        private String actorName;
        private Film idFilm;

        public Builder idFilm(Film idFilm){
            this.idFilm = idFilm;
            return this;
        }

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder actor_name(String actorName){
            this.actorName = actorName;
            return this;
        }
        public Actor build(){
            return new Actor(this);
        }
    }

    public Film getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Film idFilm) {
        this.idFilm = idFilm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
}
