package Lv0;

import java.util.Scanner;

public class ex012940 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ex012940 outer = new ex012940();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int n, int m) {
            int[] answer = new int[2];

            for (int i = n; 0 < i; i--) {
                if (n % i == 0 && m % i == 0) {
                    answer[0] = i;
                    break;
                }
            }

            for (int i = m; i < Integer.MAX_VALUE; i++) {
                if (i % n == 0 && i % m == 0) {
                    answer[1] = i;
                    break;
                }
            }

            return answer;
        }
    }
}