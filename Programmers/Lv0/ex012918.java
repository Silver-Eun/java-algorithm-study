package Lv0;

import java.util.Scanner;

public class ex012918 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex012918 outer = new ex012918();
        Solution sol = outer.new Solution();

        boolean result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public boolean solution(String s) {

            if (s.length() != 4 && s.length() != 6)
                return false;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9')
                    return false;
            }

            return true;
        }
    }
}