package Lv0;

import java.util.Scanner;

public class ex077484 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        ex077484 outer = new ex077484();
        ex077484.Solution sol = outer.new Solution();

        int[] result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int match = 0;
            int zero = 0;

            for (int i = 0; i < lottos.length; i++) {
                if (lottos[i] == 0) {
                    zero++;
                } else {
                    for (int j = 0; j < win_nums.length; j++) {
                        if (lottos[i] == win_nums[j]) {
                            match++;
                        }
                    }
                }
            }

            int maxMatch = match + zero;
            int minMatch = match;

            int maxRank = Math.min(7 - maxMatch, 6);
            int minRank = Math.min(7 - minMatch, 6);

            return new int[]{maxRank, minRank};
        }
    }
}