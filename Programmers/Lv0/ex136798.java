package Lv0;

import java.util.Scanner;

public class ex136798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ex136798 outer = new ex136798();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b, c);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;
            int[] divisor = new int[number + 1];

            for (int i = 1; i <= number; i++) {
                for (int j = i; j <= number; j += i) {
                    divisor[j]++;
                }
            }

            for (int i = 1; i <= number; i++) {
                if (divisor[i] > limit) {
                    answer += power;
                } else {
                    answer += divisor[i];
                }
            }

            return answer;
        }
    }
}