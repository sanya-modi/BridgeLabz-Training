/*
Rohan’s Library Reminder App 
Rohan wants a fine calculator:
- Input return date and due date.
- If returned late, calculate fine: ₹5/day.
- Repeat for 5 books using for-loop.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // format the dates, to avoid confusion
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Fine charged per late day
        int finePerDay = 5;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);
            // Take date input as string and convert it to LocalDate
            System.out.print("Enter due date (dd-MM-yyyy): ");
            LocalDate dueDate = LocalDate.parse(sc.next(), formatter);
            System.out.print("Enter return date (dd-MM-yyyy): ");
            LocalDate returnDate = LocalDate.parse(sc.next(), formatter);
            // Calculate number of days between due date and return date
            long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);

            // Check if the book was returned late
            if (lateDays > 0) {
                long fine = lateDays * finePerDay;
                System.out.println("\nReturned late by " + lateDays + " day");
                System.out.println("Fine: " + fine);
            } 
            else {
                System.out.println("Returned on time. No fine.");
            }
        }

        sc.close();
    }
}
