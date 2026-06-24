package Lv0;

import java.util.Scanner;

public class ex120904 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        ex120904 outer = new ex120904();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int num, int k) {
            int answer = -1;

            String s = String.valueOf(num);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - '0' == k) {
                    answer = i + 1;
                    break;
                }
            }

            return answer;
        }
    }
}