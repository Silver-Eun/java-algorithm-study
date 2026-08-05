package Lv0;

import java.util.Scanner;

public class ex012903 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex012903 outer = new ex012903();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String s) {
            String answer = "";

            if (s.length() % 2 == 0) {
                answer += s.charAt(s.length() / 2 - 1);
                answer += s.charAt(s.length() / 2);
            } else
                answer += s.charAt(s.length() / 2);

            return answer;
        }
    }
}