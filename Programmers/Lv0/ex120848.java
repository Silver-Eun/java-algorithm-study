package Lv0;

import java.util.Scanner;

public class ex120848 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120848 outer = new ex120848();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 1;

            int fact = 1;

            while (fact * (answer + 1) <= n) {
                answer++;
                fact *= answer;
            }

            return answer;
        }
    }
}