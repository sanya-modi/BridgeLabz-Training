import java.util.*;

public class AreaOfTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base of a triangle ");
        double base = sc.nextDouble();
        System.out.println("Enter height of a triangle ");
        double height = sc.nextDouble();
        //Calculate the area in cm^2
        double area = 0.5 * base * height;
        //Calculate area in square feet
        double areaInFeet = area / 930;
        //Calculate area in square inches
        double areaInInches = area * 0.155;

        //Print the area in cm, feet and inches
        System.out.println("Area in square cm " + area + " while in square feet " + areaInFeet + " and square inches is" + areaInInches);
}
}