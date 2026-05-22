package Lv0;

import java.util.Scanner;

public class ex181906 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();

        String is_prefix = sc.next();

        ex181906 outer = new ex181906();
        Solution sol = outer.new Solution();

        int result = sol.solution(my_string, is_prefix);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String my_string, String is_prefix) {
            int answer = 0;

            if (my_string.startsWith(is_prefix))
                answer = 1;

            return answer;
        }
    }
}