package Lv2;

import java.util.Scanner;
import java.util.Stack;

public class ex131704 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex131704 outer = new ex131704();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] order) {
            int answer = 0;

            Stack<Integer> stack = new Stack<>();
            int box = 1;

            for (int target : order) {
                if (!stack.isEmpty() && stack.peek() == target) {
                    stack.pop();
                    answer++;
                    continue;
                }

                while (box <= order.length && box < target) {
                    stack.push(box);
                    box++;
                }

                if (box == target) {
                    answer++;
                    box++;
                } else {
                    break;
                }
            }

            return answer;
        }
    }
}
