package Lv0;

import java.util.Scanner;

public class ex181864 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String c = sc.nextLine();

        ex181864 outer = new ex181864();
        ex181864.Solution sol = outer.new Solution();

        int result = sol.solution(s, c);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;

            String a = "";

            for (int i = 0; i < myString.length(); i++) {
                if (myString.charAt(i) == 'A')
                    a += 'B';
                else
                    a += 'A';
            }

            if (a.contains(pat))
                answer = 1;
            else
                answer = 0;

            return answer;
        }
    }
}