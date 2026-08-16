package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex135808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int m = sc.nextInt();

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex135808 outer = new ex135808();
        ex135808.Solution sol = outer.new Solution();

        int result = sol.solution(k, m, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;

            Arrays.sort(score);

            for (int i = score.length - m; i >= 0; i -= m) {
                answer += score[i] * m;
            }

            return answer;
        }
    }
}