import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Get input as age and height
        int amarAge = sc.nextInt();
        double amarHeight = sc.nextDouble();
        int akbarAge = sc.nextInt();
        double akbarHeight = sc.nextDouble();
        int anthonyAge = sc.nextInt();
        double anthonyHeight = sc.nextDouble();

        //Find youngest friend by comparing with others
        String youngest;
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        //Find tallest friend by comparing with others
        String tallest;
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);
    }
}
