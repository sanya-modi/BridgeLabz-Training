import java.util.Scanner;

public class ZaraCompanyBonus {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int employees = 10;
        //Define a double array for 10 employee
        double[] salary = new double[employees];
        double[] years = new double[employees];
        double[] bonus = new double[employees];
        double[] newSalary = new double[employees];
        // initialize variables to save total result
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        // loop to take input from the user.
        for (int i = 0; i < employees; i++) {
        double sal = sc.nextDouble();
        double yr = sc.nextDouble();
        // If salary or year of service is an invalid number
        if (sal <= 0 || yr < 0) {
        i--;
        continue;
        }
        salary[i] = sal;
        years[i] = yr;
        }
        //calculate the bonus
        for (int i = 0; i < employees; i++) {
        if (years[i] > 5) {
        bonus[i] = salary[i] * 0.05;
        } 
        else {
        bonus[i] = salary[i] * 0.02;
        }
        newSalary[i] = salary[i] + bonus[i];
        totalBonus += bonus[i];
        totalOldSalary += salary[i];
        totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
