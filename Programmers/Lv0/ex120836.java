package Lv0;

import java.util.Scanner;

public class ex120836 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120836 outer = new ex120836();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    answer++;
            }

            return answer;
        }
    }
}