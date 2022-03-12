package model;

import java.util.Date;

public class Movie {
	
	private String movieID;
	private String movieName;
	private String movieGenre;
	private Date releasedDate;
	private double duration;
	
	public Movie() {}

	public Movie(String movieID, String movieName, String movieGenre, Date releasedDate, double duration) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.releasedDate = releasedDate;
		this.duration = duration;
	}

	public String getMovieID() {
		return movieID;
	}

	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public Date getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", releasedDate=" + releasedDate + ", duration=" + duration + "]";
	}
	
}
