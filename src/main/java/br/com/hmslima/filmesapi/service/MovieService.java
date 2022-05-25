package br.com.hmslima.filmesapi.service;

import br.com.hmslima.filmesapi.entity.Movie;

import java.util.List;

public interface MovieService {

    public List<Movie> findAll();
    public Movie findById(int id);
    public void save(Movie movie);
    public void delete(int id);
}
