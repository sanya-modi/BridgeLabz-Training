package sorting.cropmonitor;

import java.util.*;

public class CropSorting {
	
	
	public static void quickSort(List<Crop> cropList, int si, int ei) {
		
		if(si >= ei) {
			return;
		}
		
		int pIdx = partition(cropList, si, ei);
		quickSort(cropList, si, pIdx-1);
		quickSort(cropList, pIdx+1, ei);
	}
	
	public static int partition(List<Crop> cropList, int si, int ei) {
		String pivot = cropList.get(ei).timeStamp;
		int i = si-1;
		
		for(int j=si; j<ei; j++) {
			if(cropList.get(j).timeStamp.compareTo(pivot) < 0) {
				i++;
				Crop temp = cropList.get(j);
				cropList.set(j, cropList.get(i));
				cropList.set(i, temp);
			}
		}
		
		i++;
		Crop temp = cropList.get(ei);
		cropList.set(ei, cropList.get(i));
		cropList.set(i, temp);
		
		return i;
	}
	
	public static void display(List<Crop> cropList) {
		for(Crop c : cropList) {
			System.out.println("Crop name : " + c.cropName) ;
			System.out.println("Temprature : " + c.temp) ;
			System.out.println("TimeStamp : " + c.timeStamp) ;
			System.out.println();
		}
	}

}
