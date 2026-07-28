package Lv0;

import java.util.Scanner;

public class ex012954 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ex012954 outer = new ex012954();
        Solution sol = outer.new Solution();

        long[] result = sol.solution(n, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];

            for (int i = 0; i < n; i++) {
                answer[i] = (long) x * (i + 1);
            }

            return answer;
        }
    }
}