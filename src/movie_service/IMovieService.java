package movie_service;

import java.util.List;

import model.Movie;

public interface IMovieService {

	public String addMovie();
	public List<Movie> viewMovieList();
	public Movie viewMovieDetails(String movieID);
	
}
