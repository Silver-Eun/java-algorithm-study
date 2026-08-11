package Lv0;

import java.util.Scanner;

public class ex134240 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex134240 outer = new ex134240();
        Solution sol = outer.new Solution();

        String result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int[] food) {
            String answer = "";

            for (int i = 1; i < food.length; i++) {
                int count = food[i] / 2;

                for (int j = 0; j < count; j++) {
                    answer += i;
                }
            }

            answer += "0";

            String reverse = "";

            for (int i = answer.length() - 1; i >= 0; i--) {
                reverse += answer.charAt(i);
            }

            return answer + reverse.substring(1);
        }
    }
}