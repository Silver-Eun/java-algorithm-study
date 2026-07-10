package Lv0;

import java.math.BigInteger;
import java.util.Scanner;

public class ex120840 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        ex120840 outer = new ex120840();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int balls, int share) {

            BigInteger n = BigInteger.ONE;
            BigInteger r = BigInteger.ONE;
            BigInteger nr = BigInteger.ONE;

            for (int i = 1; i <= balls; i++)
                n = n.multiply(BigInteger.valueOf(i));

            for (int i = 1; i <= share; i++)
                r = r.multiply(BigInteger.valueOf(i));

            for (int i = 1; i <= balls - share; i++)
                nr = nr.multiply(BigInteger.valueOf(i));

            return n.divide(r.multiply(nr)).intValue();
        }
    }
}