package texteditor;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("\n===== TEXT EDITOR MENU =====");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Display Text");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter text to insert: ");
                    String insertText = sc.nextLine();
                    editor.insert(insertText);
                    break;

                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    int n = sc.nextInt();
                    editor.delete(n);
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;

                case 5:
                    editor.display();
                    break;

                case 6:
                    System.out.println("Exiting Text Editor.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}
