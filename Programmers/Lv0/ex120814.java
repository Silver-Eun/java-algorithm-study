package Lv0;

import java.util.Scanner;

public class ex120814 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120814 outer = new ex120814();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;

            answer = n / 7;

            if (n % 7 != 0)
                answer++;

            return answer;
        }
    }
}