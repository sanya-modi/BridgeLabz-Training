import java.util.Scanner;

public class RemoveCharacter {

    //remove all occurrences of a specific character from a string.
    public static String removeChar(String text, char remove) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != remove) {
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        //Take user input
        System.out.println("Enter the text : ");
        String text = sc.nextLine();
        Sytem.out.println("Enter character to remove");
        char ch = sc.next();

        //Display result
        System.out.println("Modified String: " + removeChar(text, ch));
    }
}
