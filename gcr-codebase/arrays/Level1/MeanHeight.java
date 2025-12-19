import java.util.Scanner;

public class MeanHeight{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //define a double array named heights of size 11
    double height[] = new double[11];
    //Initialize sum variable
    double sum = 0.0;

    for(int i=0; i<11; i++){
    height[i] = sc.nextDouble(); 
    sum+=height[i];
    }
 
    //Display the mean height
    System.out.println("Mean Height : " + sum/11);
}
}