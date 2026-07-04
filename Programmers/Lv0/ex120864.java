package Lv0;

import java.util.Scanner;

public class ex120864 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120864 outer = new ex120864();
        Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            int num = 0;

            for (int i = 0; i < my_string.length(); i++) {
                if (Character.isDigit(my_string.charAt(i)))
                    num = num * 10 + (my_string.charAt(i) - '0');
                else {
                    answer += num;
                    num = 0;
                }
            }

            answer += num;

            return answer;
        }
    }
}