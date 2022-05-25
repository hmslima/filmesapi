package br.com.hmslima.filmesapi.dao;

import br.com.hmslima.filmesapi.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO {

    private EntityManager entityManager;

    @Autowired
    public MovieDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Movie> findAll() {

        Query query = entityManager.createQuery("from Movie");
        List<Movie> movies = query.getResultList();
        return movies;
    }

    @Override
    public Movie findById(int id) {

        Movie movie = entityManager.find(Movie.class, id);

        return movie;
    }

    @Override
    public void save(Movie movie) {

        Movie filmedb = entityManager.merge(movie);
        filmedb.setId(filmedb.getId());
    }

    @Override
    public void delete(int id) {

        Query query = entityManager.createQuery("delete from Movie where id=:movieId");
        query.setParameter("movieId", id);
        query.executeUpdate();
    }
}
