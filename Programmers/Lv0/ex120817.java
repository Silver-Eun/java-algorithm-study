package Lv0;

import java.util.Scanner;

public class ex120817 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120817 outer = new ex120817();
        Solution sol = outer.new Solution();

        double result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;

            for (int i = 0; i < numbers.length; i++) {
                answer += numbers[i];
            }

            answer /= numbers.length;

            return answer;
        }
    }
}