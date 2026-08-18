package Lv0;

import java.util.Scanner;

public class ex250125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[][] arr = new String[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[n].length; j++) {
                arr[i][j] = sc.next();
            }
        }

        int h = sc.nextInt();
        int w = sc.nextInt();

        ex250125 outer = new ex250125();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr, h, w);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String[][] board, int h, int w) {
            int answer = 0;
            int n = board.length;

            int[] dh = {0, 1, -1, 0};
            int[] dw = {1, 0, 0, -1};

            for (int i = 0; i < 4; i++) {
                int hCheck = h + dh[i];
                int wCheck = w + dw[i];

                if (hCheck >= 0 && hCheck < n &&
                        wCheck >= 0 && wCheck < n) {

                    if (board[h][w].equals(board[hCheck][wCheck])) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}