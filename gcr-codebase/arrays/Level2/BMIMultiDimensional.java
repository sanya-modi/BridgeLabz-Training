import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take input for a number of persons
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        //Take input for weight and height of the persons
        for (int i = 0; i < number; i++) {
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        // for negative values, ask the user to enter positive values
        if (weight <= 0 || height <= 0) {
        i--;
        continue;
        }
        personData[i][0] = weight;
        personData[i][1] = height;
        }

        for (int i = 0; i < number; i++) {
        double heightMeter = personData[i][1] / 100;
        double bmi = personData[i][0] / (heightMeter * heightMeter);
        personData[i][2] = bmi;
        if(bmi <= 18.4){
        weightStatus[i] = "Underweight";
        }
        else if (bmi <= 24.9){
        weightStatus[i] = "Normal";
        } 
        else if (bmi <= 39.9){
        weightStatus[i] = "Overweight";
        } 
        else{
        weightStatus[i] = "Obese";
        }
        }

        //Display the height, weight, BMI and status of each person
        for (int i = 0; i < number; i++) {
        System.out.println("Height: " + personData[i][1] + " Weight: " + personData[i][0] + " BMI: " + personData[i][2] + " Status: " + weightStatus[i]);
        }

    }
}
