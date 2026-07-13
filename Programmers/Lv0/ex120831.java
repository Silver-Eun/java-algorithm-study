package Lv0;

import java.util.Scanner;

public class ex120831 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120831 outer = new ex120831();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0)
                    answer += i;
            }

            return answer;
        }
    }
}