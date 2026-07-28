package Lv0;

import java.util.Scanner;

public class ex012947 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012947 outer = new ex012947();
        Solution sol = outer.new Solution();

        boolean result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public boolean solution(int x) {
            boolean answer = true;

            String s = String.valueOf(x);
            int n = 0;

            for (int i = 0; i < s.length(); i++) {
                n += s.charAt(i) - '0';
            }

            if (x % n != 0)
                answer = false;

            return answer;
        }
    }
}