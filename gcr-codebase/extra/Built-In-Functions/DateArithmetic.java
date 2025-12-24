import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // Input date
        System.out.print("Enter a date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.next());

        // Date arithmetic operations
        LocalDate resultDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        // Output
        System.out.println("Original Date : " + date);
        System.out.println("Final Date    : " + resultDate);

        sc.close();
    }
}
