package Lv0;

import java.util.Scanner;

public class ex181842 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String c = sc.nextLine();

        ex181842 outer = new ex181842();
        Solution sol = outer.new Solution();

        int result = sol.solution(s, c);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;

            if(str2.contains(str1))
                answer = 1;

            return answer;
        }
    }
}