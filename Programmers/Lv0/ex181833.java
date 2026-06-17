package Lv0;

import java.util.Scanner;

public class ex181833 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex181833 outer = new ex181833();
        Solution sol = outer.new Solution();

        int[][] result = sol.solution(n);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    class Solution {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];

            if (n == 1) answer[0][0] = 1;
            else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == j) answer[i][j] = 1;
                        else answer[i][j] = 0;
                    }
                }
            }

            return answer;
        }
    }
}