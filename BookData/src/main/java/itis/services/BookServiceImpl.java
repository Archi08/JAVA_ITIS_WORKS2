package itis.services;

import itis.dao.BooksDao;
import itis.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 24.05.2017
 *
 * @author Shaikhutdinov Artur (First Software Engineering Platform)
 * @version v1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BooksDao booksDao;


    @Override
    public void register(Book book) {
        booksDao.save(book);
    }

    @Override
    public List<Book> getAllBooksByName(String name) {
        return booksDao.findByName(name);
    }

    @Override
    public List<Book> getAll() {
        return booksDao.findAll();
    }

    @Override
    public List<Book> getAllBooksByYearOfIssue(int year) {
        return booksDao.findByYearOfIssue(year);
    }
}
