package dev.sabarish.mongorest.service;

import dev.sabarish.mongorest.MovieRepository;
import dev.sabarish.mongorest.data.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;


    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> showAllMovies()
    {
        return movieRepository.findAll();
    }
    public Movie findMovieByTitle(String title)
    {
        return movieRepository.findMovieByTitle(title).orElse(null);
    }
}
