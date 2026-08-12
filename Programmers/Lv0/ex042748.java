package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex042748 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[][] commands = new int[m][3];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                commands[i][j] = sc.nextInt();
            }
        }

        ex042748 outer = new ex042748();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(array, commands);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {
                int start = commands[i][0] - 1;
                int end = commands[i][1];
                int k = commands[i][2] - 1;

                int[] temp = Arrays.copyOfRange(array, start, end);

                Arrays.sort(temp);

                answer[i] = temp[k];
            }

            return answer;
        }
    }
}