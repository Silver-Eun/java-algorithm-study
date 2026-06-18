package Lv0;

import java.util.Scanner;

public class ex181830 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ex181830 outer = new ex181830();
        Solution sol = outer.new Solution();

        int[][] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[][] solution(int[][] arr) {

            int size = Math.max(arr.length, arr[0].length);

            int[][] answer = new int[size][size];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }

            return answer;
        }
    }
}