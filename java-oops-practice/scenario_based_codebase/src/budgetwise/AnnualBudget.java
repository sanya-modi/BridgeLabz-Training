package budgetwise;

import java.util.*;

public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("📊 Annual Budget Summary");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + totalExpenses());
        System.out.println("Net Savings: " + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        if (totalExpenses() > limit) {
            System.out.println("⚠ Annual budget exceeded!");
        }
    }
}

