package Lv0;

import java.util.Scanner;

public class ex120910 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        ex120910 outer = new ex120910();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, t);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n, int t) {
            int answer = n * (int) Math.pow(2, t);

            return answer;
        }
    }
}