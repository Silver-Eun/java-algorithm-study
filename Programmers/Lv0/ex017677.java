package Lv0;

import java.util.Scanner;

public class ex017677 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        ex017677 outer = new ex017677();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;
            return answer;
        }
    }
}