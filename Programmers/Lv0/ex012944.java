package Lv0;

import java.util.Scanner;

public class ex012944 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex012944 outer = new ex012944();
        Solution sol = outer.new Solution();

        double result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public double solution(int[] arr) {
            double answer = 0;

            for (int i = 0; i < arr.length; i++) {
                answer += arr[i];
            }

            answer /= arr.length;

            return answer;
        }
    }
}