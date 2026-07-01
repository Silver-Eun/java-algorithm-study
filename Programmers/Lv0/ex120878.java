package Lv0;

import java.util.Scanner;

public class ex120878 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        ex120878 outer = new ex120878();
        Solution sol = outer.new Solution();

        int result = sol.solution(a,b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int a, int b) {

            int gcd = gcd(a, b);

            b /= gcd;

            while (b % 2 == 0) {
                b /= 2;
            }

            while (b % 5 == 0) {
                b /= 5;
            }

            return b == 1 ? 1 : 2;
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