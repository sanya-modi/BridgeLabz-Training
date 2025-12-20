import java.util.Scanner;

public class TemperatureUnitConvertor{

    // Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
    return farhenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
    return celsius2farhenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds){
        double pounds2kilograms = 0.453592;
    return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms){
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons){
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters){
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get input from user
        double n = sc.nextDouble();

        //Display temperatues in all units
        System.out.println("Fahrenheit to Celsius: " + convertFarhenheitToCelsius(n));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(n));
        System.out.println("Pounds to kg: " + convertPoundsToKilograms(n));
        System.out.println("kg to pounds: " + convertKilogramsToPounds(n));
        System.out.println("gallons to liters: " + convertGallonsToLiters(n));
        System.out.println("liters to gallons: " + convertLitersToGallons(n));
    }
}
