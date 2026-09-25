package Lv2;

import java.util.Scanner;

public class ex012913 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[4][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                arr[j][i] = sc.nextInt();
            }
        }

        ex012913 outer = new ex012913();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        int solution(int[][] land) {
            int answer = 0;

            for (int i = 1; i < land.length; i++) {
                for (int j = 0; j < 4; j++) {
                    int max = 0;

                    for (int k = 0; k < 4; k++) {
                        if (j != k) {
                            max = Math.max(max, land[i - 1][k]);
                        }
                    }

                    land[i][j] += max;
                }
            }

            answer = Math.max(
                    Math.max(land[land.length - 1][0], land[land.length - 1][1]),
                    Math.max(land[land.length - 1][2], land[land.length - 1][3])
            );

            return answer;
        }
    }
}