package Lv0;

import java.util.Scanner;

public class ex012950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();

        int[][] arr1 = new int[m][m];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; i < arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        ex012950 outer = new ex012950();
        Solution sol = outer.new Solution();

        int[][] result = sol.solution(arr, arr1);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length];

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            return answer;
        }
    }
}