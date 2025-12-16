import java.util.*;

public class AreaOfCircle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius of circle : ");
        float r = sc.nextFloat();
        float pi = 3.14f;
        double area = (double)(pi * r * r);

System.out.println("Area of Circle : " + area);
       
}
}