import java.util.Scanner;

public class BMICalculator{

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display BMI details
    public static void displayBMI(String[][] bmiData) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.println(
                bmiData[i][0] + "\t\t" +
                bmiData[i][1] + "\t\t" +
                bmiData[i][2] + "\t\t" +
                bmiData[i][3]
            );
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // Initialize and take user input
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        //call method and display the output
        String[][] bmiResult = calculateBMI(data);
        displayBMI(bmiResult);

        sc.close();
    }
}
