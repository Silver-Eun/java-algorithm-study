package Lv0;

import java.util.Scanner;

public class ex017682 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex017682 outer = new ex017682();
        Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String dartResult) {
            int[] score = new int[3];
            int index = 0;

            for (int i = 0; i < dartResult.length(); i++) {
                char c = dartResult.charAt(i);

                if (c == '1' && i + 1 < dartResult.length()
                        && dartResult.charAt(i + 1) == '0') {

                    score[index] = 10;
                    i++;

                } else if (c >= '0' && c <= '9') {
                    score[index] = c - '0';
                }

                if (c == 'D') {
                    score[index] *= score[index];
                    index++;
                }

                if (c == 'T') {
                    score[index] *= score[index] * score[index];
                    index++;
                }

                if (c == 'S') {
                    index++;
                }

                if (c == '*') {
                    score[index - 1] *= 2;

                    if (index > 1) {
                        score[index - 2] *= 2;
                    }
                }

                if (c == '#') {
                    score[index - 1] *= -1;
                }
            }

            return score[0] + score[1] + score[2];
        }
    }
}