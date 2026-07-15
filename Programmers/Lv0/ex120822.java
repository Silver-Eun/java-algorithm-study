package Lv0;

import java.util.Scanner;

public class ex120822 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        ex120822 outer = new ex120822();
        Solution sol = outer.new Solution();

        String result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for (int i = my_string.length() - 1; 0 <= i; i--) {
                answer += my_string.charAt(i);
            }

            return answer;
        }
    }
}