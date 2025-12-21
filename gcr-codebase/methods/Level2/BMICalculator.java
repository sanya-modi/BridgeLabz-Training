import java.util.Scanner;
public class BMICalculator {

    // Method to calculate BMI and store it in 3rd column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
        double weight = data[i][0];       
        double heightCm = data[i][1];     
        // convert cm to meters
        double heightMeter = heightCm / 100;  
        double bmi = weight / (heightMeter * heightMeter);
        //Store bmi
        data[i][2] = bmi;  
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
        double bmi = data[i][2];
        if (bmi <= 18.4){
            status[i] = "Underweight";
        } 
        else if(bmi >= 18.5 && bmi < 25){
            status[i] = "Normal";
        } 
        else if(bmi >= 25 && bmi <= 39.9){
            status[i] = "Overweight";
        } 
        else{
            status[i] = "Obese";
        }
        }
        return status;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // 10 persons, 3 columns (weight, height, BMI)
        double[][] data = new double[10][3];
        // Input weight and height
        for (int i = 0; i < 10; i++) {
        data[i][0] = sc.nextDouble();
        data[i][1] = sc.nextDouble();
        }
        // Calculate BMI
        calculateBMI(data);
        // Determine BMI Status
        String[] status = determineBMIStatus(data);

        // Display result
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
        System.out.printf("%d\t%.2f\t%.2f\t%.2f\t\t%s%n",(i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

    }
}
