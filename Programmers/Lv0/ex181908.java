package Lv0;

import java.util.Scanner;

public class ex181908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        String is_suffix = sc.next();

        ex181908 outer = new ex181908();
        ex181908.Solution sol = outer.new Solution();

        int result = sol.solution(my_string, is_suffix);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String my_string, String is_suffix) {
            int answer = 0;

            if (my_string.endsWith(is_suffix))
                answer = 1;

            return answer;
        }
    }
}