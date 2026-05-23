package Lv0;

import java.util.Scanner;

public class ex181902 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();

        ex181902 outer = new ex181902();
        ex181902.Solution sol = outer.new Solution();

        int[] result = sol.solution(my_string);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String my_string) {

            int[] answer = new int[52];

            for (int i = 0; i < my_string.length(); i++) {

                char ch = my_string.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    answer[ch - 'A']++;
                } else {
                    answer[ch - 'a' + 26]++;
                }
            }

            return answer;
        }
    }
}