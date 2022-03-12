package movie_service;

import java.util.Date;
import java.util.List;

import model.Movie;

public class MovieServiceImpl implements IMovieService{

	@Override
	public String addMovie() {
		Movie movie = new Movie();
		Date date = new Date();
		movie.setMovieID("123");
		movie.setDuration(1);
		movie.setMovieGenre("Horror");
		movie.setReleasedDate(date);
		movie.setMovieName("Hello");
		return movie.toString();
	}
	
	@Override
	public List<Movie> viewMovieList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie viewMovieDetails(String movieID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	 

}
