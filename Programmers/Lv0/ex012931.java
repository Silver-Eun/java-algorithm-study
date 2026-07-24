package Lv0;

import java.util.Scanner;

public class ex012931 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012931 outer = new ex012931();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    public class Solution {
        public int solution(int n) {
            int answer = 0;

            String s = String.valueOf(n);

            for(int i = 0; i < s.length(); i++) {
                answer += s.charAt(i) - '0';
            }

            return answer;
        }
    }
}