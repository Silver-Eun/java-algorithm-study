package Lv0;

import java.util.Scanner;

public class ex181848 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex181848 outer = new ex181848();
        ex181848.Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String n_str) {
            int answer = Integer.parseInt(n_str);

            return answer;
        }
    }
}