package Lv0;

import java.util.Scanner;

public class ex087946 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[2][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arr[j][i] = sc.nextInt();
            }
        }

        ex087946 outer = new ex087946();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        int answer = 0;
        boolean[] visited;

        public int solution(int k, int[][] dungeons) {
            visited = new boolean[dungeons.length];

            dfs(k, 0, dungeons);

            return answer;
        }

        void dfs(int k, int count, int[][] dungeons) {
            answer = Math.max(answer, count);

            for (int i = 0; i < dungeons.length; i++) {
                if (!visited[i] && k >= dungeons[i][0]) {
                    visited[i] = true;

                    dfs(k - dungeons[i][1], count + 1, dungeons);

                    visited[i] = false;
                }
            }
        }
    }
}