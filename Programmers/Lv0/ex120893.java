package Lv0;

import java.util.Scanner;

public class ex120893 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120893 outer = new ex120893();
        ex120893.Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                if (Character.isUpperCase(my_string.charAt(i)))
                    answer += Character.toLowerCase(my_string.charAt(i));
                else
                    answer += Character.toUpperCase(my_string.charAt(i));

            }

            return answer;
        }
    }
}