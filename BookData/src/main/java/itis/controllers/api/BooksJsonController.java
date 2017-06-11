package itis.controllers.api;


import itis.converter.Converter;
import itis.dao.BooksDao;
import itis.dto.BookDto;
import itis.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BooksJsonController {
    @Autowired
    private BooksDao booksDao;

    @RequestMapping(value = "/annotation/books/json", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<BookDto> getAllBook() {
        List<Book> books = booksDao.findAll();
        List<BookDto> bookDtos = Converter.converterListBook(books);
        return bookDtos;
    }
}
