package Lv0;

import java.util.*;

public class ex001844 {

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

        ex001844 outer = new ex001844();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[][] maps) {
            int n = maps.length;
            int m = maps[0].length;

            int[][] distance = new int[n][m];
            Queue<int[]> queue = new LinkedList<>();

            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            queue.offer(new int[]{0, 0});
            distance[0][0] = 1;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                        continue;
                    }

                    if (maps[nx][ny] == 0 || distance[nx][ny] != 0) {
                        continue;
                    }

                    distance[nx][ny] = distance[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }

            if (distance[n - 1][m - 1] == 0) {
                return -1;
            }

            return distance[n - 1][m - 1];
        }
    }
}