package Lv0;

import java.math.BigInteger;
import java.util.Scanner;

public class ex181845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

        ex181845 outer = new ex181845();
        ex181845.Solution sol = outer.new Solution();

        String result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int n) {
            String answer = String.valueOf(n);

            return answer;
        }
    }
}