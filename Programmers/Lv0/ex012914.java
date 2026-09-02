package Lv0;

import java.util.Scanner;

public class ex012914 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012914 outer = new ex012914();
        Solution sol = outer.new Solution();

        long result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public long solution(int n) {
            if (n == 1) return 1;

            long a = 1;
            long b = 2;

            for (int i = 3; i <= n; i++) {
                long c = (a + b) % 1234567;
                a = b;
                b = c;
            }

            return b;
        }
    }
}