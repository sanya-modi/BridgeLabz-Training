package stack_queue.sort_stack;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements in stack: ");
        int n = sc.nextInt();

        System.out.println("Enter stack elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("\nOriginal Stack: " + stack);

        // Sort the stack
        SortStackUsingRecursion.sortStack(stack);

        System.out.println("Sorted Stack (Ascending): " + stack);

        sc.close();
    }
}

