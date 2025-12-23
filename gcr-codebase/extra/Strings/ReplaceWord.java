import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take user inpyt
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Word to replace: ");
        String oldWord = sc.next();
        System.out.print("New word: ");
        String newWord = sc.next();

        String[] words = sentence.split(" ");
        String result = "";
        //replaces a given word with another word in a sentence
        for (String word : words) {
            if (word.equals(oldWord)) {
                result += newWord + " ";
            } else {
                result += word + " ";
            }
        }

        //Display the result
        System.out.println("Modified sentence: " + result.trim());
    }
}
