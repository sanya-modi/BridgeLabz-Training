package geomeasure;

import java.util.*;

public class GeoMeasureMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Line[]> comparisons = new ArrayList<>();

        System.out.print("How many line comparisons do you want to perform? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nComparison " + i);

            System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2):");
            Line line1 = new Line(
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble()
            );

            System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2):");
            Line line2 = new Line(
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble()
            );

            comparisons.add(new Line[]{line1, line2});
        }

        System.out.println("\n------ COMPARISON RESULTS ------");
        for (Line[] pair : comparisons) {
            LineComparator.compare(pair[0], pair[1]);
            System.out.println("-------------------------------");
        }

        sc.close();
    }
}

