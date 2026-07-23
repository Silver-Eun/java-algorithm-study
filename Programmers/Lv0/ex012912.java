package Lv0;

import java.util.Scanner;

public class ex012912 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ex012912 outer = new ex012912();
        Solution sol = outer.new Solution();

        long result = sol.solution(n, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public long solution(int a, int b) {
            long answer = 0;

            int min = a <= b ? a : b;
            int max = a <= b ? b : a;

            for (int i = min; i <= max; i++) {
                answer += i;
            }

            return answer;
        }
    }
}