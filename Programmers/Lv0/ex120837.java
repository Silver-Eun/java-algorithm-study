package Lv0;

import java.util.Scanner;

public class ex120837 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120837 outer = new ex120837();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int hp) {
            int answer = 0;

            answer += hp / 5;
            hp %= 5;

            answer += hp / 3;
            hp %= 3;

            answer += hp;

            return answer;
        }
    }
}