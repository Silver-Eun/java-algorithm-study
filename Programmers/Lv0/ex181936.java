package Lv0;

import java.util.Scanner;

public class ex181936 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ex181936 outer = new ex181936();
        ex181936.Solution sol = outer.new Solution();

        int result = sol.solution(a, b, c);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int num, int n, int m) {
            int answer = 0;

            if (num % n == 0 && num % m == 0)
                answer = 1;
            else
                answer = 0;

            return answer;
        }
    }
}