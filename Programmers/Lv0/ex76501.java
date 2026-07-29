package Lv0;

import java.util.Scanner;

public class ex76501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] absolutes = new int[n];
        boolean[] signs = new boolean[n];


        for (int i = 0; i < n; i++) {
            absolutes[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            signs[i] = sc.nextBoolean();
        }

        ex76501 outer = new ex76501();
        Solution sol = outer.new Solution();

        int result = sol.solution(absolutes, signs);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;

            for (int i = 0; i < absolutes.length; i++) {
                if (!signs[i])
                    answer += -absolutes[i];
                else
                    answer += absolutes[i];
            }

            return answer;
        }
    }
}