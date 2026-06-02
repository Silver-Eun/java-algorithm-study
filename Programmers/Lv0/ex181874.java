package Lv0;

import java.util.Scanner;

public class ex181874 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex181874 outer = new ex181874();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String myString) {
            String answer = "";

            myString = myString.toLowerCase();

            for (int i = 0; i < myString.length(); i++) {
                if (myString.charAt(i) == 'a')
                    answer += 'A';
                else
                    answer += myString.charAt(i);
            }

            return answer;
        }
    }
}