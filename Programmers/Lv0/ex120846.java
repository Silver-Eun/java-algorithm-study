package Lv0;

import java.util.Scanner;

public class ex120846 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120846 outer = new ex120846();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                int cnt = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        cnt++;
                }
                if (3 <= cnt)
                    answer++;

            }
            return answer;
        }
    }
}