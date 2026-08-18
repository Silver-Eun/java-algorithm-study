package Lv0;

import java.util.Scanner;

public class ex140180 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex140180 outer = new ex140180();
        ex140180.Solution sol = outer.new Solution();

        int result = sol.solution(s);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String s) {
            int answer = 0;

            char x = s.charAt(0);
            int xCount = 0;
            int otherCount = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }

                if (xCount == otherCount) {
                    answer++;

                    if (i + 1 < s.length()) {
                        x = s.charAt(i + 1);
                        xCount = 0;
                        otherCount = 0;
                    }
                }
            }

            if (xCount != otherCount) {
                answer++;
            }

            return answer;
        }
    }
}