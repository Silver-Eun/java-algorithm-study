package Lv0;

import java.util.Scanner;

public class ex132267 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ex132267 outer = new ex132267();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b, c);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;

            while (n >= a) {
                int coke = (n / a) * b;
                int remain = n % a;

                answer += coke;

                n = coke + remain;
            }

            return answer;
        }
    }
}