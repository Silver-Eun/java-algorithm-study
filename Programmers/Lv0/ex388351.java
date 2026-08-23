package Lv0;

import java.util.Scanner;

public class ex388351 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] schedules = new int[n];

        for (int i = 0; i < n; i++) {
            schedules[i] = sc.nextInt();
        }

        int[][] timelogs = new int[n][7];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                timelogs[i][j] = sc.nextInt();
            }
        }

        int startday = sc.nextInt();

        ex388351 outer = new ex388351();
        Solution sol = outer.new Solution();

        int result = sol.solution(schedules, timelogs, startday);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] schedules, int[][] timelogs, int startday) {
            int answer = 0;

            for (int i = 0; i < schedules.length; i++) {

                int hour = schedules[i] / 100;
                int minute = schedules[i] % 100;
                int limit = hour * 60 + minute + 10;

                boolean success = true;

                for (int j = 0; j < 7; j++) {

                    int day = (startday + j - 1) % 7 + 1;

                    if (day == 6 || day == 7) {
                        continue;
                    }

                    int time = (timelogs[i][j] / 100) * 60
                            + timelogs[i][j] % 100;

                    if (time > limit) {
                        success = false;
                        break;
                    }
                }

                if (success) {
                    answer++;
                }
            }

            return answer;
        }
    }
}