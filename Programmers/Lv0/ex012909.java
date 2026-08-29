package Lv0;

import java.util.Scanner;

public class ex012909 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex012909 outer = new ex012909();
        Solution sol = outer.new Solution();

        boolean result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        boolean solution(String s) {
            int cnt = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(')
                    cnt++;
                else
                    cnt--;

                if (cnt < 0)
                    return false;
            }

            return cnt == 0;
        }
    }
}