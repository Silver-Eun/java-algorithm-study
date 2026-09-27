package Lv2;

import java.util.Scanner;
import java.util.Stack;

public class ex042584 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex042584 outer = new ex042584();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < prices.length; i++) {
                while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                    int index = stack.pop();
                    answer[index] = i - index;
                }

                stack.push(i);
            }

            while (!stack.isEmpty()) {
                int index = stack.pop();
                answer[index] = prices.length - 1 - index;
            }

            return answer;
        }
    }
}