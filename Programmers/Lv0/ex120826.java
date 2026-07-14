package Lv0;

import java.util.Scanner;

public class ex120826 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        ex120826 outer = new ex120826();
        Solution sol = outer.new Solution();

        String result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, String letter) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                if (String.valueOf(my_string.charAt(i)).equals(letter))
                    continue;
                answer += my_string.charAt(i);
            }

            return answer;
        }
    }
}