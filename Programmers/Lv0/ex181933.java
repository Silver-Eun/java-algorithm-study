package Lv0;

import java.util.Scanner;

public class ex181933 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.nextBoolean();

        ex181933 outer = new ex181933();
        ex181933.Solution sol = outer.new Solution();

        int result = sol.solution(a, b, flag);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int a, int b, boolean flag) {
            int answer = 0;

            if (flag) answer = a + b;
            else answer = a - b;

            return answer;
        }
    }
}