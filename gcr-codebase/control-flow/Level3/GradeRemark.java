import java.util.Scanner;

public class GradeRemark{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get float integer for 3 subject marks
        float phy = sc.nextFloat();
        float chem = sc.nextFloat();
        float maths = sc.nextFloat();
        //Calculate the average percentage
        float avg = (phy + chem + maths)/3;
   
        //calculate the grade as per the following guidelines
        System.out.println("Average Marks : " + avg);
        if(avg >=80){
        System.out.println("Grade A");
        System.out.println("Remark : Level 4, above agency-normalized standards");
        }
        else if(avg >=70 && avg < 80){
        System.out.println("Grade B");
        System.out.println("Remark : Level 3, at agency-normalized standards");
        }
        else if(avg >=60 && avg < 70){
        System.out.println("Grade C");
        System.out.println("Remark : Level 2, below, but approaching agency-normalized standards)");
        }
        else if(avg >=50 && avg < 60){
        System.out.println("Grade D");
        System.out.println("Remark : Level 1, well below agency-normalized standards)");
        }
        else if(avg >40 && avg < 50){
        System.out.println("Grade E");
        System.out.println("Remark : Level 1, too below agency-normalized standards)");
        }
        else{
        System.out.println("Remedial stndards)");
        }
        
}
}