package Lv0;

import java.util.Scanner;

public class ex012924 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012924 outer = new ex012924();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int start = 1; start <= n; start++) {
                int sum = 0;

                for (int num = start; ; num++) {
                    sum += num;

                    if (sum == n) {
                        answer++;
                        break;
                    }

                    if (sum > n) {
                        break;
                    }
                }
            }

            return answer;
        }
    }
}