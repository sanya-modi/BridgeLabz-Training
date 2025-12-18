import java.util.*;

public class DivisiblityCheck{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
        int num = sc.nextInt();
        //Check the divisibility 
        Boolean result = num%5==0;

        //Divisible by 5, if the remainder is 0
        System.out.println("Is the number " + num + " divisible by 5? " + result);
        

}
}