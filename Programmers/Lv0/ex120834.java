package Lv0;

import java.util.Scanner;

public class ex120834 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120834 outer = new ex120834();
        Solution sol = outer.new Solution();

        String result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int age) {
            String answer = "";

            String a = String.valueOf(age);

            for (int i = 0; i < a.length(); i++) {
                answer += (char) ((a.charAt(i) - '0') + 'a');
            }

            return answer;
        }
    }
}