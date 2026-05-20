package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex181909 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();

        ex181909 outer = new ex181909();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(my_string);

        for (String str : result) {
            System.out.println(str);
        }

        sc.close();
    }

    class Solution {
        public String[] solution(String my_string) {
            String[] answer = new String[my_string.length()];

            for (int i = 0; i < my_string.length(); i++) {
                answer[i] = my_string.substring(i);
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}