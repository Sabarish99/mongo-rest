package dev.sabarish.mongorest.controller;

import dev.sabarish.mongorest.data.Movie;
import dev.sabarish.mongorest.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController( MovieService movieService) {
        this.movieService = movieService;

    }

    @GetMapping
    public ResponseEntity<List<Movie>> allMovies()
    {
        return  new ResponseEntity<>(movieService.showAllMovies(), HttpStatus.OK);
    }
}
