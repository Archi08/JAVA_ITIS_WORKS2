package dto;

/**
 * 29.05.2017
 * GenreDto @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
public class GenreDto {
    private int id;
    private int filmId;
    private String genre;

    public GenreDto() {
    }
    public GenreDto(Builder builder){
        this.id = builder.id;
        this.filmId = builder.filmId;
        this.genre = builder.genre;
    }
    public static class Builder{
        private int id;
        private int filmId;
        private String genre;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder filmId(int id){
            this.filmId = id;
            return this;
        }
        public Builder genre(String genre){
            this.genre = genre;
            return this;
        }
        public GenreDto build(){
            return new GenreDto(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
