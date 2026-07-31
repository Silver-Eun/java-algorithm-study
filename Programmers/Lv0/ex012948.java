package Lv0;

import java.util.Scanner;

public class ex012948 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex012948 outer = new ex012948();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String phone_number) {
            String answer = "";

            for (int i = 0; i < phone_number.length(); i++) {
                if (4 < phone_number.length() - i)
                    answer += "*";
                else
                    answer += phone_number.charAt(i);
            }

            return answer;
        }
    }
}