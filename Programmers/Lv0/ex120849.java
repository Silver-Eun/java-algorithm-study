package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120849 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        ex120849 outer = new ex120849();
        Solution sol = outer.new Solution();

        String result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for(int i = 0; i < my_string.length(); i++) {
                if(my_string.charAt(i) == 'a' ||
                        my_string.charAt(i) == 'e' ||
                        my_string.charAt(i) == 'i' ||
                        my_string.charAt(i) == 'o' ||
                        my_string.charAt(i) == 'u')
                    continue;

                answer += my_string.charAt(i);
            }

            return answer;
        }
    }
}