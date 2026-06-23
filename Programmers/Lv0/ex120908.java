package Lv0;

import java.util.Scanner;

public class ex120908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        ex120908 outer = new ex120908();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String str1, String str2) {
            int answer = 0;

            if (str1.contains(str2))
                answer = 1;
            else
                answer = 2;

            return answer;
        }
    }
}