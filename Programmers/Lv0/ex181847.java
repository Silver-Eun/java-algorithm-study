package Lv0;

import java.util.Scanner;

public class ex181847 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex181847 outer = new ex181847();
        ex181847.Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String n_str) {
            int idx = 0;

            while (idx < n_str.length() && n_str.charAt(idx) == '0') {
                idx++;
            }

            return n_str.substring(idx);
        }
    }
}