package stack_queue.stock_span_problem;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int[] span = StockSpan.calculateSpan(prices);

        System.out.println("Stock Spans: " + Arrays.toString(span));
        sc.close();
    }
}

