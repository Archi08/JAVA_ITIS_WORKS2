package ru.itis.dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.itis.models.Film;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * 01.06.2017
 * FilmsDaoHibernate
 *
 * @author Ayupov Ayaz (First Software Engineering Platform)
 * @version v1.0
 */
@Component
public class FilmsDaoHibernate implements FilmsDao {

    private final static String JPA_FIND_ALL = "SELECT f FROM Film f ";

    @PersistenceContext
    private EntityManager entityManager;


    public FilmsDaoHibernate() {
    }


    @Override
    public Film find(int id) {
        Film film = entityManager.createQuery(JPA_FIND_ALL +" where id = :id", Film.class)
                .setParameter("id", id).getSingleResult();
        return film;
    }

    @Override
    public int save(Film model) {
        entityManager.persist(model);
        entityManager.flush();
        return model.getId();
    }

    @Override
    public void update(Film model) {
        entityManager.merge(model);
    }

    @Override
    public void delete(int id) {
        Film film = find(id);
       entityManager.remove(film);
    }

    @Override
    public List<Film> findAll() {

        List<Film> films = entityManager.createQuery(JPA_FIND_ALL, Film.class).getResultList();
        return films;
    }

    @Override
    public List<Film> findByName(String name) {
       return (List<Film>) entityManager.createQuery(JPA_FIND_ALL + "WHERE name = :name",Film.class).setParameter("name",name);
    }

    @Override
    public List<Film> findByCountry(String country) {
        return (List<Film>) entityManager.createQuery(JPA_FIND_ALL + "WHERE country = :country",Film.class).setParameter("country",country);
    }

    @Override
    public List<Film> findByProducer(String producer) {
        return (List<Film>) entityManager.createQuery(JPA_FIND_ALL + "where producer = :producer",Film.class).setParameter("producer",producer);
    }

    @Override
    public List<Film> findByGenre(String genre) {
       return (List<Film>) entityManager.createQuery(JPA_FIND_ALL + "where genre = :genre",Film.class).setParameter("genre",genre);
    }

    @Override
    public List<Film> findByActors(String actorsName) {
        return (List<Film>) entityManager.createQuery(JPA_FIND_ALL + "where actor_name = :actor_name",Film.class).setParameter("actor_name", actorsName);
    }
}
