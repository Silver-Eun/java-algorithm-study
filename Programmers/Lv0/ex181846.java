package Lv0;

import java.math.BigInteger;
import java.util.Scanner;

public class ex181846 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String c = sc.next();

        ex181846 outer = new ex181846();
        ex181846.Solution sol = outer.new Solution();

        String result = sol.solution(s, c);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String a, String b) {

            BigInteger num1 = new BigInteger(a);
            BigInteger num2 = new BigInteger(b);

            return num1.add(num2).toString();
        }
    }
}