package Lv0;

import java.util.Scanner;

public class ex181903 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();

        ex181903 outer = new ex181903();
        ex181903.Solution sol = outer.new Solution();

        String result = sol.solution(s, e, my_string);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int q, int r, String code) {
            String answer = "";

            for(int i = 0; i < code.length(); i++) {
                if(i % q == r)
                    answer += code.charAt(i);
            }

            return answer;
        }
    }
}