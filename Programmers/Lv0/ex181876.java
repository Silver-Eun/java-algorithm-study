package Lv0;

import java.util.Scanner;

public class ex181876 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myString = sc.nextLine();

        ex181876 outer = new ex181876();
        Solution sol = outer.new Solution();

        String result = sol.solution(myString);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String myString) {
            String answer = "";

            answer = myString.toLowerCase();

            return answer;
        }
    }
}