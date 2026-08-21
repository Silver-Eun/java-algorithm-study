package Lv0;

import java.util.Scanner;

public class ex131128 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        ex131128 outer = new ex131128();
        Solution sol = outer.new Solution();

        String result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String X, String Y) {
            String answer = "";

            int[] countX = new int[10];
            int[] countY = new int[10];

            for (int i = 0; i < X.length(); i++) {
                countX[X.charAt(i) - '0']++;
            }

            for (int i = 0; i < Y.length(); i++) {
                countY[Y.charAt(i) - '0']++;
            }

            for (int i = 9; i >= 0; i--) {
                int count = Math.min(countX[i], countY[i]);

                answer += String.valueOf(i).repeat(count);
            }

            if (answer.equals("")) {
                return "-1";
            }

            if (answer.charAt(0) == '0') {
                return "0";
            }

            return answer;
        }
    }
}