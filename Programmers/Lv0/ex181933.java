package Lv0;

import java.util.Scanner;

public class ex181933 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ex181933 outer = new ex181933();
        ex181933.Solution sol = outer.new Solution();

        String result = sol.solution(s);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String code) {
            String answer = "";
            int mode = 0;

            for (int i = 0; i < code.length(); i++) {
                char c = code.charAt(i);

                if (c == '1') {
                    mode = 1 - mode;
                } else {
                    if (mode == 0 && i % 2 == 0) {
                        answer += c;
                    } else if (mode == 1 && i % 2 == 1) {
                        answer += c;
                    }
                }
            }

            if (answer.equals("")) {
                return "EMPTY";
            }

            return answer;
        }
    }
}