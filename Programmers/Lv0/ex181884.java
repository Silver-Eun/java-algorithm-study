package Lv0;

import java.util.Scanner;

public class ex181884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] numbers = new int[len];

        for (int i = 0; i < len; i++) {
            numbers[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        ex181884 outer = new ex181884();
        Solution sol = outer.new Solution();

        int result = sol.solution(numbers, n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] numbers, int n) {
            int answer = 0;

            for (int i = 0; i < numbers.length; i++) {
                answer += numbers[i];
                if (n < answer)
                    break;
            }

            return answer;
        }
    }
}