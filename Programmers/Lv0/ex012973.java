package Lv0;

import java.util.Scanner;

public class ex012973 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex012973 outer = new ex012973();
        Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String s) {
            char[] stack = new char[s.length()];
            int top = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (top > 0 && stack[top - 1] == c) {
                    top--;
                } else {
                    stack[top++] = c;
                }
            }

            int answer = top == 0 ? 1 : 0;

            return answer;
        }
    }
}