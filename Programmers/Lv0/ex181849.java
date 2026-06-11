package Lv0;

import java.util.Scanner;

public class ex181849 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex181849 outer = new ex181849();
        ex181849.Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String num_str) {
            int answer = 0;

            for (int i = 0; i < num_str.length(); i++) {
                answer += num_str.charAt(i) - 48;
            }

            return answer;
        }
    }
}