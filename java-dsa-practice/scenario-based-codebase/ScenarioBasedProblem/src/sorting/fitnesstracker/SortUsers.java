package sorting.fitnesstracker;

public class SortUsers {
	
	public static void bubbleSort(User[] userList, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(userList[j].steps > userList[j+1].steps) {
					User temp = userList[j];
					userList[j] = userList[j+1];
					userList[j+1] = temp;
				}
			}
		}
	}
	
	public static void display(User[] userList) {
		int rank = 1;
		for(User u : userList) {
			System.out.println("User Name : " + u.name);
			System.out.println("User Steps :  " + u.steps);
			System.out.println("User Rank : " + rank++);
			System.out.println();
		}
	}

}
