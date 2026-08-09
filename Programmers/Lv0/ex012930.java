package Lv0;

import java.util.Scanner;

public class ex012930 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        ex012930 outer = new ex012930();
        Solution sol = outer.new Solution();

        String result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String s) {
            String answer = "";
            int index = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == ' ') {
                    answer += " ";
                    index = 0;
                } else {
                    if (index % 2 == 0)
                        answer += Character.toUpperCase(s.charAt(i));
                    else
                        answer += Character.toLowerCase(s.charAt(i));

                    index++;
                }
            }

            return answer;
        }
    }
}