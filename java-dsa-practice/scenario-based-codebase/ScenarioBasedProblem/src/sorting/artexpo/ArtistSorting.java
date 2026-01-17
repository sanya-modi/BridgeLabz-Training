package sorting.artexpo;

public class ArtistSorting {
	
	public static void insertionSort(Artist[] artist, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(artist[j].time.compareTo(artist[j+1].time) > 0) {
					Artist temp = artist[j];
					artist[j] = artist[j+1];
					artist[j+1] = temp;
				}
			}
		}
	}
	
	public static void display(Artist[] artist) {
		for(Artist a : artist) {
			System.out.println("Name : " + a.name);
			System.out.println("Registration Time : " + a.time);
			System.out.println();
		}
	}

}
