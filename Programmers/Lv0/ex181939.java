package Lv0;

import java.util.Scanner;

public class ex181939 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        ex181939 outer = new ex181939();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int a, int b) {
            int answer = 0;

            int A = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
            int B = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

            answer = (A > B) ? A : B;

            return answer;
        }
    }
}