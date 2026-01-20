package com.collections.queue_interface;

import java.util.*;

public class StackUsingQueue {

    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Push operation
        public void push(int x) {
            // Step 1: Move all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // Step 2: Add new element to q1
            q1.add(x);

            // Step 3: Move all elements back to q1
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // Pop operation
        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        // Top operation
        public int top() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }

        public boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            System.out.println("""
            
             Stack Using Queues
            1. Push
            2. Pop
            3. Top
            4. Exit
            """);

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println(val + " pushed");
                }

                case 2 -> {
                    int popped = stack.pop();
                    if (popped != -1)
                        System.out.println("Popped: " + popped);
                }

                case 3 -> {
                    int top = stack.top();
                    if (top != -1)
                        System.out.println("Top element: " + top);
                }

                case 4 -> {
                    System.out.println("Exiting 👋");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}

