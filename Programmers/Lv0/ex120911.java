package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120911 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120911 outer = new ex120911();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string) {
            String answer = "";

            my_string = my_string.toLowerCase();

            char[] a = new char[my_string.length()];

            for (int i = 0; i < a.length; i++) {
                a[i] = my_string.charAt(i);
            }

            Arrays.sort(a);

            for (int i = 0; i < a.length; i++) {
                answer += a[i];
            }

            return answer;
        }
    }
}