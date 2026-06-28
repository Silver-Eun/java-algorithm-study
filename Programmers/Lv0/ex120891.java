package Lv0;

import java.util.Scanner;

public class ex120891 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120891 outer = new ex120891();
        ex120891.Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int order) {
            int answer = 0;

            String s = String.valueOf(order);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - '0' == 3 || s.charAt(i) - '0' == 6
                        || s.charAt(i) - '0' == 9)
                    answer++;
            }

            return answer;
        }
    }
}