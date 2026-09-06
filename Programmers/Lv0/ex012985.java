package Lv0;

import java.util.Scanner;

public class ex012985 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        ex012985 outer = new ex012985();
        ex012985.Solution sol = outer.new Solution();

        int result = sol.solution(n, m, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n, int a, int b) {
            int answer = 0;

            while (a != b) {
                a = (a + 1) / 2;
                b = (b + 1) / 2;
                answer++;
            }

            return answer;
        }
    }
}