package Lv0;

import java.util.Scanner;

public class ex042626 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex042626 outer = new ex042626();
        Solution sol = outer.new Solution();

        boolean result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        boolean solution(String s) {
            boolean answer = true;

            int p = 0;
            int y = 0;

            s = s.toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'p')
                    p++;
                if (s.charAt(i) == 'y')
                    y++;
            }

            if (p != y)
                answer = false;

            return answer;
        }
    }
}