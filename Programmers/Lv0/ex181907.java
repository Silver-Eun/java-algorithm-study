package Lv0;

import java.util.Scanner;

public class ex181907 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        int n = sc.nextInt();

        ex181907 outer = new ex181907();
        ex181907.Solution sol = outer.new Solution();

        String result = sol.solution(my_string, n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            answer = my_string.substring(0, n);

            return answer;
        }
    }
}