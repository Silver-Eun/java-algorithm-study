package Lv0;

import java.util.Scanner;

public class ex012939 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex012939 outer = new ex012939();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String s) {
            String answer = "";

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            String[] a = s.split(" ");

            for (int i = 0; i < a.length; i++) {
                if (max < Integer.valueOf(a[i]))
                    max = Integer.valueOf(a[i]);
                if (Integer.valueOf(a[i]) < min)
                    min = Integer.valueOf(a[i]);
            }

            answer += min + " " + max;

            return answer;
        }
    }
}