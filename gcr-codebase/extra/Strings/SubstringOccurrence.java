import java.util.Scanner;

public class SubstringOccurrence {

    //count how many times a given substring occurs in a string.
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();
        //Call the method
        int result = countOccurrences(text, sub);
 
        //Display the result
        System.out.println("Substring occurs " + result + " times");

        sc.close();
    }
}
