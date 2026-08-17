package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex042889 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex042889 outer = new ex042889();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(N, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int N, int[] stages) {
            int[] count = new int[N + 2];

            for (int stage : stages) {
                count[stage]++;
            }

            double[] fail = new double[N];

            int reached = stages.length;

            for (int i = 1; i <= N; i++) {
                if (reached == 0) {
                    fail[i - 1] = 0;
                } else {
                    fail[i - 1] = (double) count[i] / reached;
                }

                reached -= count[i];
            }

            Integer[] stage = new Integer[N];

            for (int i = 0; i < N; i++) {
                stage[i] = i + 1;
            }

            Arrays.sort(stage, (a, b) -> {
                if (fail[a - 1] == fail[b - 1]) {
                    return a - b;
                }

                return Double.compare(fail[b - 1], fail[a - 1]);
            });

            int[] answer = new int[N];

            for (int i = 0; i < N; i++) {
                answer[i] = stage[i];
            }

            return answer;
        }
    }
}