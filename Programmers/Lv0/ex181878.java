package Lv0;

import java.util.Scanner;

public class ex181878 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myString = sc.nextLine();

        String pat = sc.nextLine();

        ex181878 outer = new ex181878();
        Solution sol = outer.new Solution();

        int result = sol.solution(myString, pat);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;

            myString = myString.toLowerCase();
            pat = pat.toLowerCase();

            if (myString.contains(pat))
                answer = 1;
            else
                answer = 0;

            return answer;
        }
    }
}