package Lv0;

import java.util.Scanner;

public class ex181873 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = sc.nextLine();

        ex181873 outer = new ex181873();
        Solution sol = outer.new Solution();

        String result = sol.solution(s, c);

        System.out.println(result);

        sc.close();

        sc.close();
    }

    class Solution {
        public String solution(String my_string, String alp) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                if (my_string.charAt(i) == alp.charAt(0))
                    answer += alp.toUpperCase();
                else
                    answer += my_string.charAt(i);
            }

            return answer;
        }
    }
}