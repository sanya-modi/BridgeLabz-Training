package com.collections.set_interface;

import java.util.*;

public class SetToSortedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of the set:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        // Convert Set to List
        List<Integer> list = new ArrayList<>(set);

        // Sort the list
        Collections.sort(list);

        System.out.println("\nOriginal Set: " + set);
        System.out.println("Sorted List: " + list);

        sc.close();
    }
}

