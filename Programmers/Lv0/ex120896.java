package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120896 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120896 outer = new ex120896();
        ex120896.Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String s) {
            String answer = "";

            int[] cnt = new int[26];

            for (int i = 0; i < s.length(); i++) {
                cnt[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s.length(); i++) {
                if (cnt[s.charAt(i) - 'a'] == 1)
                    answer += s.charAt(i);
            }

            char[] arr = answer.toCharArray();
            Arrays.sort(arr);
            answer = new String(arr);

            return answer;
        }
    }
}