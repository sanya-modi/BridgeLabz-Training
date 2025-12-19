import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get user input in double
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        //Convert height in meter
        double heightMeter = heightCm / 100;
        //Calculate
        double bmi = weight / (heightMeter * heightMeter);

        //determine the weight status of the person
        if (bmi <= 18.4) {
        System.out.println("BMI is " + bmi + " and status is Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
        System.out.println("BMI is " + bmi + " and status is Normal");
        }
        else if (bmi >= 25.0 && bmi <= 39.9) {
        System.out.println("BMI is " + bmi + " and status is Overweight");
        }
        else {
        System.out.println("BMI is " + bmi + " and status is Obese");
        }

}
}
