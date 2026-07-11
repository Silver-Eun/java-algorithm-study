package Lv0;

import java.util.Scanner;

public class ex120838 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120838 outer = new ex120838();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String letter) {
            String answer = "";

            String[] mose = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

            String[] s = letter.split(" ");

            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < mose.length; j++) {
                    if (s[i].equals(mose[j]))
                        answer += (char) ('a' + j);
                }
            }

            return answer;
        }
    }
}