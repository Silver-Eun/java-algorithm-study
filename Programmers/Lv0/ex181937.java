package Lv0;

import java.util.Scanner;

public class ex181937 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        ex181937 outer = new ex181937();
        ex181937.Solution sol = outer.new Solution();

        int result = sol.solution(a, b);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int num, int n) {
            int answer = 0;

            if (num % n == 0)
                answer = 1;
            else
                answer = 0;

            return answer;
        }
    }
}