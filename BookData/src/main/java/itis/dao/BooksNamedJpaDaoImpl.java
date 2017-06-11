package itis.dao;

import itis.models.Book;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BooksNamedJpaDaoImpl implements BooksDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Book find(int id) {
        return null;
    }

    @Override
    public int save(Book model) {
        return 0;
    }

    @Override
    public void update(Book model) {

    }

    @Override
    public void delete(int id) {

    }



//    //language=SQL
//    private final String SQL_SELECT_ALL = "SELECT * FROM books";
//    // language=SQL
//    private final String SQL_SELECT_BOOK_BY_ID = "SELECT * FROM books WHERE id = ?";
//    // language=SQL
//    private final String SQL_SELECT_BOOKS_BY_NAME = "SELECT * FROM books WHERE name = :name";
//    // language=SQL
//    private final String SQL_SELECT_BOOKS_BY_AUTHOR = "SELECT * FROM books WHERE author = :author";
//    // language=SQL
//    private final String SQL_SELECT_BOOKS_BY_TYPE = "SELECT * FROM books WHERE type = :type";
//    // language=SQL
//    private final String SQL_SELECT_BOOKS_BY_GENRE = "SELECT * FROM books WHERE genre = :genre";
//    //language=SQL
//    private final String SQL_SELECT_BOOKS_BY_YEAROFISSUE = "SELECT * FROM books WHERE yearOfIssue = :yearOfIssue";
//    // language=SQL
//    private final String SQL_INSERT_BOOK = "INSERT INTO books(name, author, type, genre, publishingHouse, yearOfIssue, numberOfPages, language, description) VALUES " +
//            "(:name , :author , :type , :genre , :publishingHouse , :yearOfIssue , :numberOfPages , :language , :description)";
//    // language=SQL
//    private final String SQL_UPDATE_BOOK_BY_ID = "UPDATE books SET name = :name , author = :author , type = :type , genre = :genre , " +
//            "publishingHouse = :publishingHouse , yearOfIssue = :yearOfIssue , numberOfPages = :numberOfPages , language = :language , description = :description WHERE id = :id ";
//    // language=SQL
//    private final String SQL_DELETE_BOOK_BY_ID = "DELETE FROM books WHERE id = :id";
//
//

    @Override
    public List<Book> findAll() {
        return entityManager.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }


    @Override
    public List<Book> findByName(String name) {
        return null;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> findByType(String type) {
        return null;
    }

    @Override
    public List<Book> findByGenre(String genre) {
        return null;
    }

    @Override
    public List<Book> findByYearOfIssue(int yearOfIssue) {
        return null;
    }
}