import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Calculate first expression
        int result1 = a + b * c;
        //Calculate second expression
        int result2 = a * b + c;
        //Calculate third expression
        int result3 = c + a / b;
        //Calculate fourth expression
        int result4 = a % b + c;

        System.out.println("The results of Int Operations are " 
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
