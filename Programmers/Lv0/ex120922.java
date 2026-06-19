package Lv0;

import java.util.Scanner;

public class ex120922 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int total = sc.nextInt();

        ex120922 outer = new ex120922();
        Solution sol = outer.new Solution();

        int result = sol.solution(num, total);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int M, int N) {
            int answer = M * N - 1;

            return answer;
        }
    }
}