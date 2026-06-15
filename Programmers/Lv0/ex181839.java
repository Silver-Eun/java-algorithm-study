package Lv0;

import java.util.Scanner;

public class ex181839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ex = sc.nextInt();

        ex181839 outer = new ex181839();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, ex);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int a, int b) {
            int answer = 0;

            if (a % 2 == 1 && b % 2 == 1) {
                answer += (a * a + b * b);
            } else if (a % 2 == 1 || b % 2 == 1) {
                answer += 2 * (a + b);
            } else if (a % 2 == 0 && b % 2 == 0) {
                answer += Math.abs(a - b);
            }

            return answer;
        }
    }
}