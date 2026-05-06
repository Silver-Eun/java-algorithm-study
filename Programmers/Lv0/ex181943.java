package Lv0;

import java.util.Scanner;

public class ex181943 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        ex181943 outer = new ex181943();
        Solution sol = outer.new Solution();

        String result = sol.solution(my_string, overwrite_string, s);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, String overwrite_string, int s) {
            String answer = "";

            answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
            return answer;
        }
    }
}