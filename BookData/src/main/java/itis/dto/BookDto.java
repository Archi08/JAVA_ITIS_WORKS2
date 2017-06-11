package itis.dto;


public class BookDto {

    private int id;
    private String name;
    private String author;
    private String type;
    private String genre;
    private String publishingHouse;
    private int yearOfIssue;
    private int numberOfPages;
    private String language;
    private String description;

    public BookDto(int id, String name, String author, String type, String genre, String publishingHouse,
                   int yearOfIssue, int numberOfPages, String language, String description) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        this.genre = genre;
        this.publishingHouse = publishingHouse;
        this.yearOfIssue = yearOfIssue;
        this.numberOfPages = numberOfPages;
        this.language = language;
        this.description = description;
    }

    public BookDto() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
