package budgetwise;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Budget Type:");
        System.out.println("1. Monthly Budget");
        System.out.println("2. Annual Budget");
        int choice = sc.nextInt();

        System.out.print("Enter Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Expense Limit: ");
        double limit = sc.nextDouble();

        // Dynamic category limits
        System.out.print("Enter number of categories: ");
        int catCount = sc.nextInt();
        sc.nextLine();

        Map<String, Double> categoryLimits = new HashMap<>();

        for (int i = 0; i < catCount; i++) {
            System.out.print("Enter category name: ");
            String cat = sc.nextLine();

            System.out.print("Enter limit for " + cat + ": ");
            double catLimit = sc.nextDouble();
            sc.nextLine();

            categoryLimits.put(cat, catLimit);
        }

        // Polymorphic object creation
        Budget budget;
        if (choice == 1) {
            budget = new MonthlyBudget(income, limit, categoryLimits);
        } else {
            budget = new AnnualBudget(income, limit, categoryLimits);
        }

        // Dynamic transactions
        System.out.print("Enter number of transactions: ");
        int txCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < txCount; i++) {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Type (INCOME/EXPENSE): ");
            String type = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            budget.addTransaction(
                new Transaction(amount, type, LocalDate.now(), category)
            );
        }

        System.out.println("\n----- Budget Analysis -----");
        budget.generateReport();     // polymorphic
        budget.detectOverspend();
        System.out.println("Net Savings: " + budget.calculateSavings());

        sc.close();
    }
}
