package Lv0;

import java.util.Scanner;

public class ex012934 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        ex012934 outer = new ex012934();
        Solution sol = outer.new Solution();

        long result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public long solution(long n) {
            long x = (long) Math.sqrt(n);

            if (x * x == n) {
                return (x + 1) * (x + 1);
            }

            return -1;
        }
    }
}