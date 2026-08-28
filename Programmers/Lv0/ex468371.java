package Lv0;

import java.util.Scanner;

public class ex468371 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] park = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                park[i][j] = sc.nextInt();
            }
        }

        ex468371 outer = new ex468371();
        Solution sol = outer.new Solution();

        int result = sol.solution(park);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[][] signals) {
            int lcm = 1;

            for (int[] signal : signals) {
                int cycle = signal[0] + signal[1] + signal[2];
                lcm = lcm(lcm, cycle);
            }

            for (int time = 1; time <= lcm; time++) {
                boolean allYellow = true;

                for (int[] signal : signals) {
                    int g = signal[0];
                    int y = signal[1];
                    int cycle = signal[0] + signal[1] + signal[2];

                    int current = (time - 1) % cycle;

                    if (current < g || current >= g + y) {
                        allYellow = false;
                        break;
                    }
                }

                if (allYellow) {
                    return time;
                }
            }

            return -1;
        }

        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }

            return a;
        }

        private int lcm(int a, int b) {
            return a / gcd(a, b) * b;
        }
    }
}