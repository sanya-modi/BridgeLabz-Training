import java.util.Scanner;

public class BMICalculation{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take input for a number of persons
        int persons = sc.nextInt();
        //Create arrays to store the weight, height, BMI, and weight status
        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];
        //Take input for the weight and height of the persons
        for (int i = 0; i < persons; i++) {
        weight[i] = sc.nextDouble();
        height[i] = sc.nextDouble();
        }
        //Calculate the BMI 
        for(int i = 0; i < persons; i++){
        double heightMeter = height[i] / 100;
        bmi[i] = weight[i] / (heightMeter * heightMeter);
        //find the weight status of the persons
        if (bmi[i] <= 18.4) {
        status[i] = "Underweight";
        }
        else if (bmi[i] <= 24.9) {
        status[i] = "Normal";
        }
        else if (bmi[i] <= 39.9) {
        status[i] = "Overweight";
        } 
        else {
        status[i] = "Obese";
        }
        }

        //Display the height, weight, BMI, and weight status of each person
        for (int i = 0; i < persons; i++) {
        System.out.println("Height: " + height[i] + " Weight: " + weight[i] + " BMI: " + bmi[i] + " Status: " + status[i]);
        }
    }
}
