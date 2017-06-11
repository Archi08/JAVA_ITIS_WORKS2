package itis.controllers;

import itis.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import itis.services.BookService;

import java.util.List;

/**
 * 25.05.2017
 *
 * @author Shaikhutdinov Artur (First Software Engineering Platform)
 * @version v1.0
 *
 */@Controller("booksControllerAnnotation")
public class BooksController  {

     @Autowired
    private BookService bookService;


    @RequestMapping(value = "/annotation/books/jsp", method = RequestMethod.GET)
    public ModelAndView getAll() {
        ModelAndView result = new ModelAndView("booksAll");
        List<Book> books= bookService.getAll();
        result.addObject("booksModel", books);
        return result;
    }

    @RequestMapping(value = "/annotation/books/ftl", method = RequestMethod.GET)
    public String getAll(@ModelAttribute("model")ModelMap model) {
        List<Book> books = bookService.getAll();
        model.addAttribute("booksModel", books);
        return "booksView";
    }
}
