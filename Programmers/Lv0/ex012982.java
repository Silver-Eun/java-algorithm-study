package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex012982 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        ex012982 outer = new ex012982();
        ex012982.Solution sol = outer.new Solution();

        int result = sol.solution(arr, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;

            Arrays.sort(d);

            for (int i = 0; i < d.length; i++) {
                if (budget >= d[i]) {
                    budget -= d[i];
                    answer++;
                } else {
                    break;
                }
            }

            return answer;
        }
    }
}