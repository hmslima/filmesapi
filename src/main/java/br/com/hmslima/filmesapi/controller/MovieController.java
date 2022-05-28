package br.com.hmslima.filmesapi.controller;

import br.com.hmslima.filmesapi.entity.Movie;
import br.com.hmslima.filmesapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService filmeService) {
        this.movieService = filmeService;
    }

    @GetMapping("/")
    public ModelAndView myHome() {

        ModelAndView modelAndView = new ModelAndView("redirect:/filmes");

        return modelAndView;
    }

    @GetMapping("/filmes")
    public List<Movie> getMovies() {
        return movieService.findAll();
    }

    @GetMapping("/filmes/{id}")
    public Movie getMovie(@PathVariable int id) {
        Movie movie = movieService.findById(id);

        if (movie == null) {
            throw new RuntimeException("Filme não encontrado - " + id);
        }
        return movie;
    }

    /*@PostMapping("/filmes")
    public Movie saveMovie(@RequestBody Movie movie) {
        movie.setId(0);

        movieService.save(movie);

        return movie;
    }

    @PutMapping("/filmes")
    public Movie updateMovie(@RequestBody Movie movie) {

        movieService.save(movie);

        return movie;
    }

    @DeleteMapping("/filmes/{id}")
    public void deleteMovie(@PathVariable int id) {

        Movie movie = movieService.findById(id);

        if (movie == null) {
            throw new RuntimeException("Filme não encontrado - " + id);
        }

        movieService.delete(id);
    }*/

}
