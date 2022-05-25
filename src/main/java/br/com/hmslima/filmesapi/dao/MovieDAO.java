package br.com.hmslima.filmesapi.dao;

import br.com.hmslima.filmesapi.entity.Movie;

import java.util.List;

public interface MovieDAO {

    public List<Movie> findAll();
    public Movie findById(int id);
    public void save(Movie filme);
    public void delete(int id);
}
