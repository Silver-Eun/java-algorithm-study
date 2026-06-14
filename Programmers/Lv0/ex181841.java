package Lv0;

import java.util.Scanner;

public class ex181841 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str_list = new String[n];

        for (int i = 0; i < n; i++) {
            str_list[i] = sc.next();
        }

        String ex = sc.next();

        ex181841 outer = new ex181841();
        Solution sol = outer.new Solution();

        String result = sol.solution(str_list, ex);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String[] str_list, String ex) {
            String answer = "";

            for (int i = 0; i < str_list.length; i++) {
                if (!str_list[i].contains(ex))
                    answer += str_list[i];
            }

            return answer;
        }
    }
}