package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex012917 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex012917 outer = new ex012917();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String s) {
            String answer = "";

            String[] a = s.split("");

            Arrays.sort(a);

            for (int i = a.length - 1; i >= 0; i--) {
                answer += a[i];
            }

            return answer;
        }
    }
}