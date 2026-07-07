package Lv0;

import java.util.Scanner;

public class ex120851 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        ex120851 outer = new ex120851();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            for (int i = 0; i < my_string.length(); i++) {
                if (Character.isDigit(my_string.charAt(i)))
                    answer += my_string.charAt(i) - '0';
            }

            return answer;
        }
    }
}