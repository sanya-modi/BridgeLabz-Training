package sorting.cinemahouse;

import java.time.LocalTime;

public class SortMovies {
	
	public static void bubbleSort(Movie[] movieList, int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(movieList[j].showTime.isAfter(movieList[j + 1].showTime) ) {
					LocalTime temp = movieList[j].showTime;
					movieList[j].showTime = movieList[j+1].showTime;
					movieList[j+1].showTime = temp;
				}
			}
		}
		
	}
	
	public static void display(Movie[] movieList) {
		for(Movie m : movieList) {
			System.out.print("Movie Name: " + m.name);
			System.out.println(" Movie Time: " + m.showTime);
		}
	}
}
