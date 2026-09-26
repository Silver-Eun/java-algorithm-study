package Lv2;

import java.util.Scanner;

public class ex017687 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        ex017687 outer = new ex017687();
        Solution sol = outer.new Solution();

        String result = sol.solution(a, b, c, d);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int n, int t, int m, int p) {
            String answer = "";

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < t * m; i++) {
                sb.append(Integer.toString(i, n).toUpperCase());
            }

            for (int i = p - 1; i < sb.length() && answer.length() < t; i += m) {
                answer += sb.charAt(i);
            }

            return answer;
        }
    }
}