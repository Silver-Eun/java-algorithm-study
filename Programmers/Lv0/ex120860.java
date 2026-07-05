package Lv0;

import java.util.Scanner;

public class ex120860 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }

        ex120860 outer = new ex120860();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[][] dots) {

            int minX = dots[0][0];
            int maxX = dots[0][0];
            int minY = dots[0][1];
            int maxY = dots[0][1];

            for (int i = 1; i < dots.length; i++) {
                minX = Math.min(minX, dots[i][0]);
                maxX = Math.max(maxX, dots[i][0]);

                minY = Math.min(minY, dots[i][1]);
                maxY = Math.max(maxY, dots[i][1]);
            }

            return (maxX - minX) * (maxY - minY);
        }
    }
}