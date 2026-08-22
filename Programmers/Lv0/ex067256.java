package Lv0;

import java.util.Scanner;

public class ex067256 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] absolutes = new int[n];


        for (int i = 0; i < n; i++) {
            absolutes[i] = sc.nextInt();
        }

        String a = sc.next();

        ex067256 outer = new ex067256();
        Solution sol = outer.new Solution();

        String result = sol.solution(absolutes, a);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";

            int L = 10;
            int R = 12;

            for (int i = 0; i < numbers.length; i++) {
                int number = numbers[i];

                if (number == 1 || number == 4 || number == 7) {
                    answer += "L";
                    L = number;

                } else if (number == 3 || number == 6 || number == 9) {
                    answer += "R";
                    R = number;

                } else {
                    if (number == 0)
                        number = 11;

                    int distanceL = Math.abs((L - number) / 3)
                            + Math.abs((L - number) % 3);

                    int distanceR = Math.abs((R - number) / 3)
                            + Math.abs((R - number) % 3);

                    if (distanceL < distanceR) {
                        answer += "L";
                        L = number;

                    } else if (distanceL > distanceR) {
                        answer += "R";
                        R = number;

                    } else {
                        if (hand.equals("left")) {
                            answer += "L";
                            L = number;
                        } else {
                            answer += "R";
                            R = number;
                        }
                    }
                }
            }

            return answer;
        }
    }
}