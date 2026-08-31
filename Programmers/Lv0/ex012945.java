package Lv0;

import java.util.Scanner;

public class ex012945 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012945 outer = new ex012945();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int a = 0;
            int b = 1;

            for (int i = 2; i <= n; i++) {
                int c = (a + b) % 1234567;
                a = b;
                b = c;
            }

            return b;
        }
    }
}