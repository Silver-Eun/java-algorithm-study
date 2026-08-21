package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex064061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] data = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] data1 = new int[m];

        for (int i = 0; i < m; i++) {
            data1[i] = sc.nextInt();
        }

        ex064061 outer = new ex064061();
        ex064061.Solution sol = outer.new Solution();

        int result = sol.solution(data, data1);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;

            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < moves.length; i++) {
                int column = moves[i] - 1;

                for (int j = 0; j < board.length; j++) {
                    if (board[j][column] != 0) {
                        arr.add(board[j][column]);
                        board[j][column] = 0;


                        if (2 <= arr.size()) {
                            if (arr.get(arr.size() - 1) == arr.get(arr.size() - 2)) {
                                answer += 2;
                                arr.remove(arr.size() - 1);
                                arr.remove(arr.size() - 1);
                            }
                        }

                        break;
                    }
                }
            }

            return answer;
        }
    }
}