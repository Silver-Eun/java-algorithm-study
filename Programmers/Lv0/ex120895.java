package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120895 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        ex120895 outer = new ex120895();
        ex120895.Solution sol = outer.new Solution();

        String result = sol.solution(s, num1, num2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";

            for(int i = 0; i < my_string.length(); i++) {
                if(i == num1)
                    answer += my_string.charAt(num2);
                else if (i == num2)
                    answer += my_string.charAt(num1);
                else
                    answer += my_string.charAt(i);
            }

            return answer;
        }
    }
}