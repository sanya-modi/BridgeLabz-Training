package sorting.flashdealz;

public class SortProducts {

	
	public static void quickSort(Product[] productsList, int si, int ei) {
		if(si >= ei) {
			return;
		}
		
		int pIdx = partition(productsList, si, ei);
		quickSort(productsList, si, pIdx-1);
		quickSort(productsList, pIdx+1, ei);
	}
	
	public static int partition(Product[] productsList, int si, int ei) {
		Product pivot = productsList[ei];
		int i = si-1;
		
		for(int j=si; j<ei; j++) {
			if(productsList[j].discount < pivot.discount) {
				i++;
				Product temp = productsList[i];
				productsList[i] = productsList[j];
				productsList[j] = temp;
			}
		}
		
		i++;
		Product temp = productsList[i];
		productsList[i] = productsList[ei];
		productsList[ei] = temp;
		
		return i;
	}
	
	public static void display(Product[] productsList) {
		for(Product p : productsList) {
			System.out.println("Product name : " + p.name);
			System.out.println("Discount : " + p.discount);
			System.out.println();
		}
	}
	
}
