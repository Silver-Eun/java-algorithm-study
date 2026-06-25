package Lv0;

import java.util.Scanner;

public class ex120898 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = sc.next();

        ex120898 outer = new ex120898();
        ex120898.Solution sol = outer.new Solution();

        int result = sol.solution(message);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String message) {
            int answer = 2 * message.length();

            return answer;
        }
    }
}