package com.gevernova.datastructure.stackandqueue.stockspan;
import java.util.Stack;

public class StockSpan {
    // Function to calculate stock spans
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n]; // Output array
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < n; i++) {
            // Pop prices from stack while current price is higher
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, price is greater than all on its left
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index to stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.println("Stock Prices: ");
        for (int price : prices) System.out.print(price + " ");

        System.out.println("\nStock Spans: ");
        for (int s : span) System.out.print(s + " ");
    }
}
