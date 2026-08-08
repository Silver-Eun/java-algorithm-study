package Lv0;

import java.util.Scanner;

public class ex147355 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        ex147355 outer = new ex147355();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            int len = p.length();

            long pNum = Long.parseLong(p);

            for (int i = 0; i <= t.length() - len; i++) {
                String sub = t.substring(i, i + len);

                long num = Long.parseLong(sub);

                if (num <= pNum) {
                    answer++;
                }
            }

            return answer;
        }
    }
}