package Lv0;

import java.util.Scanner;

public class ex012949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        ex012949 outer = new ex012949();
        Solution sol = outer.new Solution();

        int[][] result = sol.solution(arr, arr1);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr2[0].length];

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    for (int k = 0; k < arr2.length; k++) {
                        answer[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            return answer;
        }
    }
}