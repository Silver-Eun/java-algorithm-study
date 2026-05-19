package Lv0;

import java.util.Scanner;

public class ex181914 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        ex181914 outer = new ex181914();
        Solution sol = outer.new Solution();

        int result = sol.solution(number);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String number) {
            int sum = 0;

            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - '0';
            }

            return sum % 9;
        }
    }
}