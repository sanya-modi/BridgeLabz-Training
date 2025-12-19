import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get an integer input
        int num = sc.nextInt();
        //Check if input is a natural number
        if (num < 1) {
            System.out.println("Invalid input");
            return;
        }

        int size = num / 2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= num; i++) {
        if (i % 2 == 0){
        even[evenIndex++] = i;
        } 
        else{
        odd[oddIndex++] = i;
        }
        }

        //Print all odd numbers
        for (int i = 0; i < oddIndex; i++) {
        System.out.println(odd[i]);
        }
        //Print all even number
        for (int i = 0; i < evenIndex; i++) {
        System.out.println(even[i]);
        }
    }
}
