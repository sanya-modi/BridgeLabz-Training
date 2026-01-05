package stack_queue.sort_stack;
import java.util.Stack;

/*
 * Sort a stack using recursion (ascending order)
 */
public class SortStackUsingRecursion {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {

        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Sort remaining stack
        sortStack(stack);

        // Insert element back in sorted order
        insertInSortedOrder(stack, top);
    }

    // Helper function to insert element in sorted order
    private static void insertInSortedOrder(Stack<Integer> stack, int value) {

        // Base case
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Recursive call
        insertInSortedOrder(stack, value);

        // Put back removed element
        stack.push(top);
    }
}

