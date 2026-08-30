package Lv0;

import java.util.Scanner;

public class ex012951 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex012951 outer = new ex012951();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String s) {
            String answer = "";
            boolean first = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == ' ') {
                    answer += c;
                    first = true;
                } else {
                    if (first) {
                        if (Character.isLetter(c))
                            c = Character.toUpperCase(c);
                    } else {
                        if (Character.isLetter(c))
                            c = Character.toLowerCase(c);
                    }

                    answer += c;
                    first = false;
                }
            }

            return answer;
        }
    }
}
