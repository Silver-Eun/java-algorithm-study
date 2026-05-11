package Lv0;

import java.util.Scanner;

public class ex181934 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ineq = sc.nextLine();
        String eq = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();

        ex181934 outer = new ex181934();
        ex181934.Solution sol = outer.new Solution();

        int result = sol.solution(ineq, eq, n, m);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String ineq, String eq, int n, int m) {
            int answer = 0;

            String op = ineq + eq;

            switch (op) {
                case ">=": return (n >= m) ? 1 : 0;
                case "<=": return (n <= m) ? 1 : 0;
                case ">!": return (n > m) ? 1 : 0;
                case "<!": return (n < m) ? 1 : 0;
            }

            return answer;
        }
    }
}