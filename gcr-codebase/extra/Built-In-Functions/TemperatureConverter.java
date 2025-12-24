import java.util.Scanner;

public class TemperatureConverter{

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        double result;
 
        //Display the result
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            result = celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit = " + result);
        } 
        else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            result = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperature in Celsius = " + result);
        } 
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
