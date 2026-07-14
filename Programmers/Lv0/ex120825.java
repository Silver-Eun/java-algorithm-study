package Lv0;

import java.util.Scanner;

public class ex120825 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        ex120825 outer = new ex120825();
        Solution sol = outer.new Solution();

        String result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                for (int j = 0; j < n; j++)
                    answer += my_string.charAt(i);
            }

            return answer;
        }
    }
}