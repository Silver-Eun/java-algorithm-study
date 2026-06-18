package Lv0;

import java.util.Scanner;

public class ex181829 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ex181829 outer = new ex181829();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[][] board, int k) {
            int answer = 0;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (i + j <= k)
                        answer += board[i][j];
                }
            }

            return answer;
        }
    }
}