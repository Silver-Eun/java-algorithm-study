package Lv0;

import java.util.Scanner;

public class ex120830 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ex120830 outer = new ex120830();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n, int k) {
            int answer = 0;

            if (10 <= n)
                k -= n / 10;

            answer = n * 12000 + k * 2000;

            return answer;
        }
    }
}