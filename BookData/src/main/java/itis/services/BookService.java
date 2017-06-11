package itis.services;

import itis.models.Book;

import java.util.List;

/**
 * 24.05.2017
 *
 * @author Shaikhutdinov Artur (First Software Engineering Platform)
 * @version v1.0
 */
public interface BookService {
    void register(Book book);
    List<Book> getAllBooksByName(String name);
    List<Book> getAll();
    List<Book> getAllBooksByYearOfIssue(int year);
}
