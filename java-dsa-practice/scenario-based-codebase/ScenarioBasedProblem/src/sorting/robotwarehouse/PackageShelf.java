package sorting.robotwarehouse;

public class PackageShelf {
	
	public static void insertionSort(Package[] shelf, int n) {
		
		for(int i=1; i<n; i++) {
			Package key = shelf[i];
			int j = i-1;
			
			while(j>=0 && shelf[j].weight > key.weight ) {
				shelf[j+1] = shelf[j];
				j--;
			}
			
			shelf[j+1] = key;
		}
	}
	
	public static void display(Package[] shelf) {
		for(Package p : shelf) {
			System.out.print(p.weight + " ");
		}
		System.out.println();
	}

}
