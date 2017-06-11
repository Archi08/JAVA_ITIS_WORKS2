package itis.converter;


import itis.dto.BookDto;
import itis.models.Book;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static BookDto convert(Book model) {
        return new BookDto(model.getId(),
                model.getName(),
                model.getAuthor(),
                model.getType(),
                model.getGenre(),
                model.getPublishingHouse(),
                model.getYearOfIssue(),
                model.getNumberOfPages(),
                model.getLanguage(),
                model.getDescription());
    }

    public static List<BookDto> converterListBook(List<Book> bookList) {
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book model : bookList) {
            BookDto dto = convert(model);
            bookDtos.add(dto);
        }
        return bookDtos;
    }
}
