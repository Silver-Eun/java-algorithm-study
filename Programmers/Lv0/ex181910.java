package Lv0;

import java.util.Scanner;

public class ex181910 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        ex181910 outer = new ex181910();
        Solution sol = outer.new Solution();

        String result = sol.solution(s, n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            answer = my_string.substring(my_string.length() - n, my_string.length());

            return answer;
        }
    }
}