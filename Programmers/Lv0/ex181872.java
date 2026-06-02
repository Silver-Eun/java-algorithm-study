package Lv0;

import java.util.Scanner;

public class ex181872 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = sc.nextLine();

        ex181872 outer = new ex181872();
        Solution sol = outer.new Solution();

        String result = sol.solution(s, c);

        System.out.println(result);

        sc.close();

        sc.close();
    }

    class Solution {
        public String solution(String myString, String pat) {
            String answer = "";

            answer = myString.substring(0, myString.lastIndexOf(pat) + pat.length());

            return answer;
        }
    }
}