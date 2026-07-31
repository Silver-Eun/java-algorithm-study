package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex012910 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int b = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ex012910 outer = new ex012910();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int divisor) {
            int idx = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0)
                    idx++;
            }

            int[] answer = new int[idx];

            int idx1 = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[idx1] = arr[i];
                    idx1++;
                }
            }

            if (answer.length == 0) {
                return new int[]{-1};
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}