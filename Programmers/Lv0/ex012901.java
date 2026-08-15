package Lv0;

import java.util.Scanner;

public class ex012901 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        ex012901 outer = new ex012901();
        Solution sol = outer.new Solution();

        String result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int a, int b) {
            int[] days = {31, 29, 31, 30, 31, 30,
                    31, 31, 30, 31, 30, 31};

            int total = b - 1;

            for (int i = 0; i < a - 1; i++) {
                total += days[i];
            }

            String[] week = {
                    "FRI", "SAT", "SUN", "MON",
                    "TUE", "WED", "THU"
            };

            return week[total % 7];
        }
    }
}