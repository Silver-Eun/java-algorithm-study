package Lv0;

import java.util.Scanner;

public class ex181935 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        ex181935 outer = new ex181935();
        ex181935.Solution sol = outer.new Solution();

        int result = sol.solution(a);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;

            if (n % 2 == 0) {
                for (int i = 0; i <= n; i += 2) {
                    answer += i * i;
                }
            } else {
                for (int i = 1; i <= n; i += 2) {
                    answer += i;
                }
            }

            return answer;
        }
    }
}