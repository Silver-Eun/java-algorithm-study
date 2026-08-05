package Lv0;

import java.util.Scanner;

public class ex012922 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012922 outer = new ex012922();
        Solution sol = outer.new Solution();

        String result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int n) {
            String answer = "";

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0)
                    answer += "수";
                else
                    answer += "박";
            }

            return answer;
        }
    }
}