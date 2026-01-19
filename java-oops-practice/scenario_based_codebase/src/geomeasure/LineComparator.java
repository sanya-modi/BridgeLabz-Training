package geomeasure;

class LineComparator {

    public static void compare(Line l1, Line l2) {

        double len1 = l1.calculateLength();
        double len2 = l2.calculateLength();

        System.out.println("Length of Line 1: " + len1);
        System.out.println("Length of Line 2: " + len2);

        if (len1 == len2) {
            System.out.println("Both lines are equal in length.");
        } else if (len1 > len2) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 2 is longer than Line 1.");
        }
    }
}

