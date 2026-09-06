package Lv0;

import java.util.Scanner;
import java.util.Stack;

public class ex076502 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex076502 outer = new ex076502();
        Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String s) {
            int answer = 0;

            for (int x = 0; x < s.length(); x++) {
                String str = s.substring(x) + s.substring(0, x);
                Stack<Character> stack = new Stack<>();
                boolean valid = true;

                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);

                    if (c == '(' || c == '[' || c == '{') {
                        stack.push(c);
                    } else {
                        if (stack.isEmpty()) {
                            valid = false;
                            break;
                        }

                        char top = stack.pop();

                        if ((c == ')' && top != '(') ||
                                (c == ']' && top != '[') ||
                                (c == '}' && top != '{')) {
                            valid = false;
                            break;
                        }
                    }
                }

                if (valid && stack.isEmpty()) {
                    answer++;
                }
            }

            return answer;
        }
    }
}