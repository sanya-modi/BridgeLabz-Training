package com.collections.queue_interface;

import java.util.*;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        // Step 1: add first binary number
        queue.add("1");

        System.out.println("First " + n + " binary numbers:");

        // Step 2: generate binary numbers
        for (int i = 0; i < n; i++) {

            String current = queue.remove();
            System.out.print(current + " ");

            queue.add(current + "0");
            queue.add(current + "1");
        }

        sc.close();
    }
}
