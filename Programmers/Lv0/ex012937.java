package Lv0;

import java.util.Scanner;

public class ex012937 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012937 outer = new ex012937();
        Solution sol = outer.new Solution();

        String result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int num) {
            String answer = "";

            if(num % 2 == 0)
                answer = "Even";
            else
                answer = "Odd";

            return answer;
        }
    }
}