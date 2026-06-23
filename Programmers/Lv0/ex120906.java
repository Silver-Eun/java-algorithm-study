package Lv0;

import java.util.Scanner;

public class ex120906 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120906 outer = new ex120906();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;

            String a = String.valueOf(n);

            for (int i = 0; i < a.length(); i++) {
                answer += Integer.parseInt(String.valueOf(a.charAt(i)));
            }

            return answer;
        }
    }
}