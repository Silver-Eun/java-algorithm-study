package Lv0;

import java.util.Scanner;

public class ex120882 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[a][b];

        for (int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ex120882 outer = new ex120882();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[][] score) {
            int[] answer = new int[score.length];

            for (int i = 0; i < score.length; i++) {
                answer[i] = 1;
            }

            for (int i = 0; i < score.length; i++) {
                for (int j = 0; j < score.length; j++) {
                    int sumI = score[i][0] + score[i][1];
                    int sumJ = score[j][0] + score[j][1];

                    if (sumJ > sumI) {
                        answer[i]++;
                    }
                }
            }

            return answer;
        }
    }
}