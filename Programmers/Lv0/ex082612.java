package Lv0;

import java.util.Scanner;

public class ex082612 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();

        ex082612 outer = new ex082612();
        Solution sol = outer.new Solution();

        long result = sol.solution(n, m, o);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public long solution(int price, int money, int count) {
            long answer = -1;

            long cnt = 0;

            for (int i = 1; i <= count; i++) {
                cnt += price * i;
            }

            if (cnt <= money)
                answer = 0;
            else
                answer = cnt - money;

            return answer;
        }
    }
}