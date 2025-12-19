import java.util.*;

public class MultiplicationTable{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get an integer input 
        int num = sc.nextInt();
        //Define an array of 10 integer elements 
        int result[] = new int[10];

        for(int i=1; i<=10; i++){
        System.out.println(num + " * " + i + " = " + num*i);
        result[i-1] = num*i;
        }
}
}