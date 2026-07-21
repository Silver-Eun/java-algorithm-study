package Lv0;

import java.util.Scanner;

public class ex120808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        int a = sc.nextInt();

        ex120808 outer = new ex120808();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n, m, o, a);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {

            int numer = numer1 * denom2 + numer2 * denom1;
            int denom = denom1 * denom2;

            int gcd = gcd(numer, denom);

            return new int[]{numer / gcd, denom / gcd};
        }

        public int gcd(int a, int b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
    }
}