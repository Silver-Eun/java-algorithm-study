package Lv0;

import java.util.Scanner;

public class ex087390 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();
        long k = sc.nextLong();

        ex087390 outer = new ex087390();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n, m, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int n, long left, long right) {
            int[] answer = new int[(int) (right - left + 1)];

            for (int i = 0; i < answer.length; i++) {
                long index = left + i;

                long row = index / n;
                long col = index % n;

                answer[i] = (int) Math.max(row, col) + 1;
            }

            return answer;
        }
    }
}