package Lv0;

import java.util.Scanner;

public class ex120892 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        ex120892 outer = new ex120892();
        ex120892.Solution sol = outer.new Solution();

        String result = sol.solution(s, n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String cipher, int code) {
            String answer = "";

            for (int i = 1; i <= cipher.length(); i++) {
                if (i % code == 0)
                    answer += cipher.charAt(i - 1);
            }

            return answer;
        }
    }
}