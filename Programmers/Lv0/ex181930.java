package Lv0;

import java.util.Scanner;

public class ex181930 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ex181930 outer = new ex181930();
        ex181930.Solution sol = outer.new Solution();

        int result = sol.solution(a, b, c);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int a, int b, int c) {
            int answer = 0;

            if (a != b && b != c && a != c) answer = a + b + c;
            else if ((a == b && a != c) || (a == c && a != b) || (b == c && a != c))
                answer = (a + b + c) * (a * a + b * b + c * c);
            else if (a == b && a == c)
                answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);

            return answer;
        }
    }
}