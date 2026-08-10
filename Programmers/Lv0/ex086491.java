package Lv0;

import java.util.Scanner;

public class ex086491 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[2][n];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ex086491 outer = new ex086491();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[][] sizes) {
            int maxWidth = 0;
            int maxHeight = 0;

            for (int i = 0; i < sizes.length; i++) {

                int width = Math.max(sizes[i][0], sizes[i][1]);
                int height = Math.min(sizes[i][0], sizes[i][1]);

                maxWidth = Math.max(maxWidth, width);
                maxHeight = Math.max(maxHeight, height);
            }

            return maxWidth * maxHeight;
        }
    }
}