package Lv0;

import java.util.Scanner;

public class ex181850 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex181850 outer = new ex181850();
        ex181850.Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(double flo) {
            int answer = 0;

            answer = (int)flo;

            return answer;
        }
    }
}