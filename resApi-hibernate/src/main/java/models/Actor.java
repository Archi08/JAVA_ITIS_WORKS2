package models;

/**
 * 29.05.2017
 * Actor
 *
 * @author Ayupov Ayaz (First Software Engineering Platform)
 * @version v1.0
 */
public class Actor {
    private int id;
    private String actorName;
    private int filmId;
    public Actor(Builder builder){
        this.id = builder.id;
        this.id = builder.filmId;
        this.actorName = builder.actorName;
    }
    public static class Builder{
        private int id;
        private String actorName;
        private int filmId;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder filmId(int id){
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

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
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
