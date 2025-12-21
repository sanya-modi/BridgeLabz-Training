import java.util.Scanner;

public class YoungestAndTallest {

    // find the youngest of the 3 friends
    public static int findYoungest(int[] ages){
        int youngest = 0;
       for (int i = 1; i < 3; i++) {
          if (ages[i] < ages[youngest]){
           youngest = i;
          }
        }
    return youngest;
    }

    // find the tallest of the 3 friends
    public static int findTallest(double[] heights){
        int tallest = 0;
       for (int i = 1; i < 3; i++) {
          if (heights[i] > heights[tallest]) {
                tallest = i;
          }
        }
    return tallest;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Create array for names, ages, height
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        //Take user input for age and height for the 3 friends
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        //display the youngest and tallest of the 3 friends
        System.out.println("The youngest friend is " + names[findYoungest(ages)]);
        System.out.println("The tallest friend is " + names[findTallest(heights)]);
    }
}
