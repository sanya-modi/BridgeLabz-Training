package sorting.cropmonitor;
import java.util.*;

public class CropMonitorApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of crop to monitor :");
		int n = sc.nextInt();
		sc.nextLine();
		List<Crop> cropList = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter name of crop:");
			String cropName = sc.nextLine();
			System.out.println("Enter temperatue in Celsius:");
			String temp = sc.nextLine();
			System.out.println("Enter time stamp in HH:MM:SS :");
			String timeStamp = sc.nextLine();
			
			cropList.add(new Crop(cropName, temp, timeStamp));
		}
		
		CropSorting.quickSort(cropList, 0, n-1);
		
		CropSorting.display(cropList);
	}
	
}
