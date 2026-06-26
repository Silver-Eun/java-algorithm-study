package Lv0;

import java.util.Scanner;

public class ex120897 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120897 outer = new ex120897();
        ex120897.Solution sol = outer.new Solution();

        int[] result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int n) {

            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            int[] answer = new int[count];

            int idx = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    answer[idx++] = i;
                }
            }

            return answer;
        }
    }
}