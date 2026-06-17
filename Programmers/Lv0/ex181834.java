package Lv0;

import java.util.Scanner;

public class ex181834 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex181834 outer = new ex181834();
        ex181834.Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String myString) {
            String answer = "";

            for (int i = 0; i < myString.length(); i++) {
                if (myString.charAt(i) - 'l' < 0)
                    answer += 'l';
                else
                    answer += myString.charAt(i);
            }

            return answer;
        }
    }
}