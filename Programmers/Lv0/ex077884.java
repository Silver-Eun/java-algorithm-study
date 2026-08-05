package Lv0;

import java.util.Scanner;

public class ex077884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ex077884 outer = new ex077884();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int left, int right) {
            int answer = 0;

            for (int i = left; i <= right; i++) {
                int cnt = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        cnt++;
                }

                if (cnt % 2 == 0)
                    answer += i;
                else
                    answer -= i;
            }

            return answer;
        }
    }
}