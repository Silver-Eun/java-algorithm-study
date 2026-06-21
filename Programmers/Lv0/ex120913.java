package Lv0;

import java.util.Scanner;

public class ex120913 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        ex120913 outer = new ex120913();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String[] solution(String my_str, int n) {

            String[] answer = new String[(my_str.length() + n - 1) / n];

            for (int i = 0; i < answer.length; i++) {

                int start = i * n;
                int end = Math.min(start + n, my_str.length());

                answer[i] = my_str.substring(start, end);
            }

            return answer;
        }
    }
}