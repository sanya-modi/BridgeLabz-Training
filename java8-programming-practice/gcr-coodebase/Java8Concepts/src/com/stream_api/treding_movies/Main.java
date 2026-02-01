package com.stream_api.treding_movies;

import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		List<Movie> movieList = Arrays.asList(
				new Movie("Inception", 8.8, 2010),
		        new Movie("Interstellar", 8.6, 2014),
		        new Movie("The Dark Knight", 9.0, 2008),
		        new Movie("Avengers: Endgame", 8.4, 2019),
		        new Movie("Titanic", 7.9, 1997),
		        new Movie("Forrest Gump", 8.8, 1994),
		        new Movie("The Matrix", 8.7, 1999),
		        new Movie("Gladiator", 8.5, 2000),
		        new Movie("Joker", 8.4, 2019),
		        new Movie("Parasite", 8.6, 2019)
				);
		
		movieList.stream()
		          .filter(m -> m.release_year > 2000)
		      .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
		          .limit(5)
		          .collect(Collectors.toList())
		          .forEach(System.out::println);
	}

}
