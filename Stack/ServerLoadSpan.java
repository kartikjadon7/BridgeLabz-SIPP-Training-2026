package Stack;

import java.util.*;

public class ServerLoadSpan {

    public static int[] loadSpan(int[] load) {

        int n = load.length;
        int[] span = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    load[stack.peek()] <= load[i]) {

                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int[] load = {30, 35, 40, 38, 35, 50, 45};

        int[] ans = loadSpan(load);

        System.out.println("Server Load Span:");

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}