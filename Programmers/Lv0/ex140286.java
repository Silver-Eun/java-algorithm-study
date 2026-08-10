package Lv0;

import java.util.Scanner;

public class ex140286 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        ex140286 outer = new ex140286();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            int[] last = new int[26];

            for (int i = 0; i < last.length; i++) {
                last[i] = -1;
            }

            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';

                if (last[index] == -1) {
                    answer[i] = -1;
                } else {
                    answer[i] = i - last[index];
                }

                last[index] = i;
            }

            return answer;
        }
    }
}