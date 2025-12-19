import java.util.Scanner;

public class GradeCalculation{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take input for the number of students
        int students = sc.nextInt();
        //Create arrays to store marks, percent, and grades
        double[] physics = new double[students];
        double[] chemistry = new double[students];
        double[] maths = new double[students];
        double[] percentage = new double[students];
        char[] grade = new char[students];
        String[] remark = new String[students];
        //Take input for marks
        for (int i = 0; i < students; i++) {
        double p = sc.nextDouble();
        double c = sc.nextDouble();
        double m = sc.nextDouble();
        //If the marks are negative, ask the user to enter positive values and decrement the index
        if (p < 0 || c < 0 || m < 0) {
        i--;
        continue;
        }
        physics[i] = p;
        chemistry[i] = c;
        maths[i] = m;
        }
        //Calculate the percentage
        for(int i = 0; i < students; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
        //Calculate grade of the students based on the percentage
        if(percentage[i] >= 80){
        grade[i] = 'A';
        remark[i] = "Level 4, above agency-normalized standards";
        } 
        else if(percentage[i] >= 70){
        grade[i] = 'B';
        remark[i] = "Level 3, at agency-normalized standards";
        } 
        else if (percentage[i] >= 60) {
        grade[i] = 'C';
        remark[i] = "Level 2, below but approaching standards";
        } 
        else if (percentage[i] >= 50) {
        grade[i] = 'D';
        remark[i] = "Level 1, well below standards";
        } 
        else if(percentage[i] >= 40) {
        grade[i] = 'E';
        remark[i] = "Level 1-, too below standards";
        }
        else {
        grade[i] = 'R';
        remark[i] = "Remedial standards";
        }
        }

        //Display the marks, percentages, and grades of each student
        for (int i = 0; i < students; i++) {
        System.out.println("Physics: " + physics[i] + " Chemistry: " + chemistry[i] + " Maths: " + maths[i] + " Percentage: " + percentage[i] + " Grade: " + grade[i] + " Remark: " + remark[i]
            );
        }
    }
}
