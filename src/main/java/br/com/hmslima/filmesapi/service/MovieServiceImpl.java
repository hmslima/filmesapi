package br.com.hmslima.filmesapi.service;

import br.com.hmslima.filmesapi.dao.MovieDAO;
import br.com.hmslima.filmesapi.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieDAO movieDAO;

    @Autowired
    public MovieServiceImpl(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    @Override
    @Transactional
    public List<Movie> findAll() {
        return movieDAO.findAll();
    }

    @Override
    @Transactional
    public Movie findById(int id) {
        return movieDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Movie movie) {
        movieDAO.save(movie);
    }

    @Override
    @Transactional
    public void delete(int id) {
        movieDAO.delete(id);
    }
}
