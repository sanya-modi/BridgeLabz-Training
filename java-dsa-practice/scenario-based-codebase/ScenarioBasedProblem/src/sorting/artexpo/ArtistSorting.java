package sorting.artexpo;

public class ArtistSorting {
	
	public static void insertionSort(Artist[] artist, int n) {
		for(int i=1; i<n; i++) {
			Artist key = artist[i];
			int j= i-1;
			
			while(j>=0 && artist[j].time.compareTo(key.time) > 0) {
				artist[j+1] = artist[j];
				j--;
			}
			
			artist[j+1] = key;
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
