package Lv0;

import java.util.Scanner;

public class ex181871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = sc.nextLine();

        ex181871 outer = new ex181871();
        Solution sol = outer.new Solution();

        int result = sol.solution(s, c);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;

            for (int i = 0; i <= myString.length() - pat.length(); i++) {
                if (myString.substring(i, i + pat.length()).equals(pat))
                    answer++;
            }

            return answer;
        }
    }
}