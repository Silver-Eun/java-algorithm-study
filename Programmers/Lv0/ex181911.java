package Lv0;

import java.util.Scanner;

public class ex181911 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] my_strings = new String[n];
        int[][] parts = new int[n][2];

        for (int i = 0; i < n; i++) {
            my_strings[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            parts[i][0] = sc.nextInt();
            parts[i][1] = sc.nextInt();
        }

        ex181911 outer = new ex181911();
        Solution sol = outer.new Solution();

        String result = sol.solution(my_strings, parts);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String[] my_strings, int[][] parts) {
            String answer = "";

            for (int i = 0; i < parts.length; i++) {
                answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
            }

            return answer;
        }
    }
}