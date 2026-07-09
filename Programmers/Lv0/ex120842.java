package Lv0;

import java.util.Scanner;

public class ex120842 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] box = new int[n];

        for (int i = 0; i < box.length; i++) {
            box[i] = sc.nextInt();
        }

        int s = sc.nextInt();

        ex120842 outer = new ex120842();
        Solution sol = outer.new Solution();

        int[][] result = sol.solution(box, s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[][] solution(int[] num_list, int n) {

            int[][] answer = new int[num_list.length / n][n];

            int idx = 0;

            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < n; j++) {
                    answer[i][j] = num_list[idx++];
                }
            }

            return answer;
        }
    }
}