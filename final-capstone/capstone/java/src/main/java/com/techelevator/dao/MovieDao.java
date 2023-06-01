package com.techelevator.dao;

import com.techelevator.model.Movie;

import java.util.List;

public interface MovieDao {

    Movie getRandomMovie();

    List<Movie> getFavorites();
}
