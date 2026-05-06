package Lv0;

import java.util.Scanner;

public class ex181942 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        ex181942 outer = new ex181942();
        Solution sol = outer.new Solution();

        String result = sol.solution(str1, str2);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String str1, String str2) {
            String answer = "";

            for (int i = 0; i < str1.length(); i++) {
                answer += str1.charAt(i);
                answer += str2.charAt(i);
            }
            return answer;
        }
    }
}