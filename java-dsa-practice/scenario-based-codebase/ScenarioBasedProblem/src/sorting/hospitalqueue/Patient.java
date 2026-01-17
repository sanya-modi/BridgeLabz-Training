package sorting.hospitalqueue;
import java.util.*;

public class Patient {
	
	public static void bubbleSort(int[] patients) {
		int n = patients.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(patients[j] > patients[j+1]) {
					int temp = patients[j];
					patients[j] = patients[j+1];
					patients[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
		System.out.println("Enter number of patients");
		int n = sc.nextInt();
		int patients[] = new int[n];
		
		for (int i = 0; i < n ; i++) {
			System.out.println("Enter criticality level of patient " + (i+1));
			patients[i] = sc.nextInt();
		}
		
		bubbleSort(patients);
		
		System.out.println("Patients are sorted by criticality level");
		System.out.println(Arrays.toString(patients));
	}

}
