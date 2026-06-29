package Lv0;

import java.util.Scanner;

public class ex120888 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120888 outer = new ex120888();
        ex120888.Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                if (!answer.contains(String.valueOf(my_string.charAt(i))))
                    answer += my_string.charAt(i);
            }

            return answer;
        }
    }
}