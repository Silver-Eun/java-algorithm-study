package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120885 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b = sc.next();
        String a = sc.next();

        ex120885 outer = new ex120885();
        ex120885.Solution sol = outer.new Solution();

        String result = sol.solution(b, a);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String bin1, String bin2) {
            String answer = "";

            int a = Integer.parseInt(bin1, 2);
            int b = Integer.parseInt(bin2, 2);

            answer = Integer.toBinaryString(a + b);

            return answer;
        }
    }
}