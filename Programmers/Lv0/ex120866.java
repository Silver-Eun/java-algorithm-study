package Lv0;

import java.util.Scanner;

public class ex120866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ex120866 outer = new ex120866();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[][] board) {
            int n = board.length;

            int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

            boolean[][] danger = new boolean[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (board[i][j] == 1) {
                        danger[i][j] = true;

                        for (int k = 0; k < 8; k++) {
                            int nx = i + dx[k];
                            int ny = j + dy[k];

                            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                                danger[nx][ny] = true;
                            }
                        }
                    }
                }
            }

            int answer = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!danger[i][j]) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}