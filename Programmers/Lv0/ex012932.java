package Lv0;

import java.util.Scanner;

public class ex012932 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        ex012932 outer = new ex012932();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(long n) {
            String s = String.valueOf(n);
            int[] answer = new int[s.length()];

            for (int i = s.length() - 1; i >= 0; i--) {
                answer[s.length() - 1 - i] = s.charAt(i) - '0';
            }

            return answer;
        }
    }
}