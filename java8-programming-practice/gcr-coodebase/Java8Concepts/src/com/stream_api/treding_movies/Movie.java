package com.stream_api.treding_movies;

public class Movie {
	
	String name;
	double rating;
	int release_year;
	
	public Movie(String name, double rating, int release_year) {
		super();
		this.name = name;
		this.rating = rating;
		this.release_year = release_year;
	}

	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getRelease_year() {
		return release_year;
	}

	@Override
	public String toString() {
		return "Movie : name=" + name + ", rating=" + rating + ", release_year=" + release_year ;
	}
	
	

}
