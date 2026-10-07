package Lv2;

import java.util.Scanner;

public class ex017679 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();
        String[] arr = new String[o];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        ex017679 outer = new ex017679();
        Solution sol = outer.new Solution();

        int result = sol.solution(m, n, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int m, int n, String[] board) {
            int answer = 0;

            char[][] map = new char[m][n];

            for (int i = 0; i < m; i++) {
                map[i] = board[i].toCharArray();
            }
            while (true) {
                boolean[][] remove = new boolean[m][n];
                boolean found = false;

                for (int i = 0; i < m - 1; i++) {
                    for (int j = 0; j < n - 1; j++) {

                        if (map[i][j] != ' ' &&
                                map[i][j] == map[i][j + 1] &&
                                map[i][j] == map[i + 1][j] &&
                                map[i][j] == map[i + 1][j + 1]) {

                            remove[i][j] = true;
                            remove[i][j + 1] = true;
                            remove[i + 1][j] = true;
                            remove[i + 1][j + 1] = true;
                            found = true;
                        }
                    }
                }

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (remove[i][j]) {
                            map[i][j] = ' ';
                            answer++;
                        }
                    }
                }

                for (int j = 0; j < n; j++) {
                    int index = m - 1;

                    for (int i = m - 1; i >= 0; i--) {
                        if (map[i][j] != ' ') {
                            map[index][j] = map[i][j];
                            index--;
                        }
                    }

                    while (index >= 0) {
                        map[index][j] = ' ';
                        index--;
                    }
                }

                if (!found) {
                    break;
                }
            }

            return answer;
        }
    }
}
