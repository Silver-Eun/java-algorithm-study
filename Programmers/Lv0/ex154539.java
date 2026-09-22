package Lv0;

import java.util.Scanner;
import java.util.Stack;

public class ex154539 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex154539 outer = new ex154539();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            Stack<Integer> stack = new Stack<>();

            for (int i = numbers.length - 1; i >= 0; i--) {
                while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    answer[i] = -1;
                } else {
                    answer[i] = stack.peek();
                }

                stack.push(numbers[i]);
            }

            return answer;
        }
    }
}