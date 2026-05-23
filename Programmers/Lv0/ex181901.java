package Lv0;

import java.util.Scanner;

public class ex181901 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ex181901 outer = new ex181901();
        ex181901.Solution sol = outer.new Solution();

        int[] result = sol.solution(n, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int n, int k) {
            int[] answer = new int[n / k];

            for (int i = 1; i <= n / k; i++) {
                answer[i - 1] = i * k;
            }

            return answer;
        }
    }
}