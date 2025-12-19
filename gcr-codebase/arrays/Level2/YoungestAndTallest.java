import java.util.Scanner;

public class YoungestAndTallest {
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
        int youngestIndex = 0;
        int tallestIndex = 0;
        // find the youngest and the tallest of the 3 friends
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        //display the youngest and tallest of the 3 friends
        System.out.println("The youngest friend is " + names[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex]);
    }
}
