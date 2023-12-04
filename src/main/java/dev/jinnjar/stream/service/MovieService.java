package dev.jinnjar.stream.service;

import dev.jinnjar.stream.model.Movie;
import dev.jinnjar.stream.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author adnan
 * @since 12/5/2023
 */
@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }
}
