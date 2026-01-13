package texteditor;

import java.util.Stack;

public class TextEditor {

    private String text = "";
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    // Insert text
    public void insert(String newText) {
        undoStack.push(text);
        text += newText;
        redoStack.clear();
        System.out.println("Text inserted.");
    }

    // Delete last n characters
    public void delete(int n) {
        if (n > text.length()) {
            System.out.println("Cannot delete more characters than text length.");
            return;
        }
        undoStack.push(text);
        text = text.substring(0, text.length() - n);
        redoStack.clear();
        System.out.println("Text deleted.");
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }
        redoStack.push(text);
        text = undoStack.pop();
        System.out.println("Undo performed.");
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }
        undoStack.push(text);
        text = redoStack.pop();
        System.out.println("Redo performed.");
    }

    // Display current text
    public void display() {
        System.out.println("Current Text: \"" + text + "\"");
    }
}