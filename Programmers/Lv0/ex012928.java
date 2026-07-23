package Lv0;

import java.util.Scanner;

public class ex012928 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012928 outer = new ex012928();
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
                    answer += i;
            }

            return answer;
        }
    }
}