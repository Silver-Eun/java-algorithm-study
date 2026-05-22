package Lv0;

import java.util.Scanner;

public class ex181904 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();

        ex181904 outer = new ex181904();
        ex181904.Solution sol = outer.new Solution();

        String result = sol.solution(my_string, s, e);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int m, int c) {
            String answer = "";

            for (int i = c - 1; i < my_string.length(); i += m) {
                answer += my_string.charAt(i);
            }

            return answer;
        }
    }
}