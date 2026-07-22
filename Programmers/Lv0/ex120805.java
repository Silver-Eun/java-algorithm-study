package Lv0;

import java.util.Scanner;

public class ex120805 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ex120805 outer = new ex120805();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;

            answer = num1 / num2;

            return answer;
        }
    }
}