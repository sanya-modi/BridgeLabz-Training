import java.util.*;

public class CopyArrayFrom2Dto1D{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get row and column from user
    	int row = sc.nextInt();
    	int column = sc.nextInt();
    	//Define 2D array and index variable
    	int arr[][] = new int[row][column];
    	int index = 0;
    	//Take user input for 2D array value
    	for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
            arr[i][j] = sc.nextInt();
            }
        } 

    	//create a 1D array of size rows*columns
    	int[] copiedArray = new int[row * column];
     
        //Copy every element of the 2D array into the 1D array
    	for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){ 
            copiedArray[index] = arr[i][j];
            index++;
            }
    	}

        //Display values of copied 1D array
        for(int i=0; i<copiedArray.length; i++){ 
        System.out.print(copiedArray[i] + " ");
        }
}
}