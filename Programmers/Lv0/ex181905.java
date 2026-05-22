package Lv0;

import java.util.Scanner;

public class ex181905 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();

        ex181905 outer = new ex181905();
        ex181905.Solution sol = outer.new Solution();

        String result = sol.solution(my_string, s, e);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int s, int e) {
            String answer = "";

            answer = my_string.substring(0, s);

            for (int i = e; s <= i; i--) {
                answer += my_string.charAt(i);
            }

            answer += my_string.substring(e + 1, my_string.length());

            return answer;
        }
    }
}