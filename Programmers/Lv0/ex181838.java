package Lv0;

import java.util.Scanner;

public class ex181838 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] date1 = new int[3];
        int[] date2 = new int[3];

        for (int i = 0; i < 3; i++) {
            date1[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            date2[i] = sc.nextInt();
        }

        ex181838 outer = new ex181838();
        Solution sol = outer.new Solution();

        int result = sol.solution(date1, date2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] date1, int[] date2) {
            int answer = 0;

            if (date1[0] < date2[0]) {
                answer = 1;
            } else if (date1[0] == date2[0] && date1[1] < date2[1]) {
                answer = 1;
            } else if (date1[0] == date2[0] && date1[1] == date2[1]
                    && date1[2] < date2[2]) {
                answer = 1;
            }

            return answer;
        }
    }
}