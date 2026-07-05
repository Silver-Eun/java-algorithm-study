package Lv0;

import java.util.Scanner;

public class ex120854 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        ex120854 outer = new ex120854();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];

            for(int i = 0; i < answer.length; i++) {
                answer[i] = strlist[i].length();
            }

            return answer;
        }
    }
}