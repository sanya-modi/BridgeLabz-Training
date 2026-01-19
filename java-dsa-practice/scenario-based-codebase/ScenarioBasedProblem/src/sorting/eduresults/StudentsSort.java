package sorting.eduresults;

public class StudentsSort {
	
	public static void mergeSort(Students[] studentList,  int si, int ei) {
		
		if(si>=ei) {
			return;
		}
		
		int mid = (ei + si)/2;
		
		mergeSort(studentList, si, mid);
		mergeSort(studentList, mid+1, ei);
		
		merge(studentList, si, mid, ei);
		
	}
	
	public static void merge(Students[] studentList, int si, int mid, int ei) {
		
		Students[] temp = new Students[ei-si+1];
		
		int i = si;
		int j = mid+1;
		int k = 0;
		
		while(i<= mid && j<=ei) {
			if(studentList[i].score <= studentList[j].score) {
				temp[k] = studentList[i];
				i++;
			}
			else {
				temp[k] = studentList[j];
				j++;	
			}
			k++;
		}
		
		while(i<= mid ) {
				temp[k] = studentList[i];
				i++;
			    k++;
		}
		
		while(j<= ei ) {
			temp[k] = studentList[j];
			j++;
		    k++;
	}
		
		for (int idx = 0; idx < temp.length; idx++) {
			//Use si + idx because the temporary array represents only a subrange of the original array, and copying must start from the original subarray’s starting index.
		    studentList[si + idx] = temp[idx];
		}
		
	}
	
	public static void display(Students[] studentList) {
		for(Students s : studentList) {
			System.out.println("Student name : " + s.name);
			System.out.println("Score : " + s.score);
			System.out.println();
		}
	}

}
