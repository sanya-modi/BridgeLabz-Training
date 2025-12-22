public class ZaraBonus{

    // Method to generate salary (5-digit) and years of service
    // Column 0 → Salary, Column 1 → Years of Service
    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];
        for (int i = 0; i < employees; i++) {
        // 5-digit salary (10000 to 99999)
        data[i][0] = (int) (Math.random() * 90000) + 10000;
        // Years of service (1 to 10 years)
        data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;

    }

    // Method to calculate new salary and bonus
    // Column 0 → Old Salary, Column 1 → Bonus, Column 2 → New Salary
    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
        double salary = data[i][0];
        int years = (int) data[i][1];
        double bonus;
        // Bonus logic
        if (years > 5) {
        bonus = salary * 0.05; // 5% bonus
        } 
        else {
        bonus = salary * 0.02; // 2% bonus
        }
        result[i][0] = salary;
        result[i][1] = bonus;
        result[i][2] = salary + bonus;
        }
        return result;
    }

    // Method to calculate and display totals
    public static void displaySummary(double[][] original, double[][] updated) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;
        System.out.println("Emp  OldSalary  Years  Bonus    NewSalary");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < original.length; i++) {
        totalOldSalary += updated[i][0];
        totalBonus += updated[i][1];
        totalNewSalary += updated[i][2];
        System.out.printf("%-4d %-10.2f %-6.0f %-8.2f %-10.2f%n", (i + 1), updated[i][0], original[i][1], updated[i][1], updated[i][2]);
        }
        System.out.println("--------------------------------------------");
        System.out.printf("TOTAL %-10.2f        %-8.2f %-10.2f%n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int employees = 10;

        // Step 1: Generate salary and service data
        double[][] employeeData = generateEmployeeData(employees);
        // Step 2: Calculate bonus and new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        // Step 3: Display results
        displaySummary(employeeData, updatedData);
    }
}
