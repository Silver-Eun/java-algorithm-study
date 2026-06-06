package Lv0;

import java.util.Scanner;

public class ex181863 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ex181863 outer = new ex181863();
        ex181863.Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String rny_string) {
            String answer = "";

            for(int i = 0; i < rny_string.length(); i++) {
                if(rny_string.charAt(i) == 'm')
                    answer += "rn";
                else
                    answer += rny_string.charAt(i);
            }

            return answer;
        }
    }
}