package sorting.icecreamrush;

public class SortByPopularity {
	
	public static void bubbleSort(IceCream[] iceCream, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(iceCream[j].rating > iceCream[j+1].rating) {
					IceCream temp = iceCream[j];
					iceCream[j] = iceCream[j+1];
					iceCream[j+1] = temp;
				}
			}
		}
	}
	
	public static void display(IceCream[] iceCream) {
		for(IceCream ic : iceCream) {
			System.out.println("Flavour Name : " + ic.name);
			System.out.println("Rating : " + ic.rating);
			System.out.println();
		}
	}

}
