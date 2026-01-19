package sorting.eduresults;

import java.util.Scanner;

public class EduResultsApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        Students[] students = new Students[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student name:");
            String name = sc.nextLine();

            System.out.println("Enter Score (out of 100) :");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Students(name, score);
        }

        // Merge Sort call
        StudentsSort.mergeSort(students, 0, n - 1);

        System.out.println("Students sorted by score");
        StudentsSort.display(students);

        sc.close();
    }

}
