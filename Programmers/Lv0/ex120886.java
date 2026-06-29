package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120886 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b = sc.next();
        String a = sc.next();

        ex120886 outer = new ex120886();
        ex120886.Solution sol = outer.new Solution();

        int result = sol.solution(b, a);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String before, String after) {
            int answer = 0;

            char[] a = before.toCharArray();
            char[] b = after.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            answer = Arrays.equals(a, b) ? 1 : 0;

            return answer;
        }
    }
}