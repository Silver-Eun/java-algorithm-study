package Lv0;

import java.util.Scanner;

public class ex120876 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] lines = new int[3][2];

        for (int i = 0; i < 3; i++) {
            lines[i][0] = sc.nextInt();
            lines[i][1] = sc.nextInt();
        }

        ex120876 outer = new ex120876();
        Solution sol = outer.new Solution();

        int result = sol.solution(lines);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[][] lines) {
            int answer = 0;

            int[] arr = new int[201];

            for (int i = 0; i < 3; i++) {
                int start = lines[i][0];
                int end = lines[i][1];

                for (int j = start; j < end; j++) {
                    arr[j + 100]++;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 2) {
                    answer++;
                }
            }

            return answer;
        }
    }
}