package dto;

/**
 * 29.05.2017
 * ActorDto @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
public class ActorDto {
    private int id;
    private String actorName;
    private int filmId;

    public ActorDto(){}
    public ActorDto(Builder builder){
        this.id = builder.id;
        this.actorName = builder.actorName;
        this.filmId = builder.filmId;
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
            this.filmId = id;
            return this;
        }
        public Builder actorName(String actorName){
            this.actorName = actorName;
            return this;
        }
        public ActorDto build(){
            return new ActorDto(this);
        }
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

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
}
