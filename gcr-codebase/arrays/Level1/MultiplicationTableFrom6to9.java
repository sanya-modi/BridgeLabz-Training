import java.util.*;

public class MultiplicationTableFrom6to9{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get an integer input 
        int num = sc.nextInt();
        //Define an array of 4 integer elements 
        int result[] = new int[4];

        for(int i=6; i<=9; i++){
        System.out.println(num + " * " + i + " = " + num*i);
        result[i-6] = num*i;
        }
}
}