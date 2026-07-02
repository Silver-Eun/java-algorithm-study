package Lv0;

import java.util.Scanner;

public class ex120871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120871 outer = new ex120871();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;

            int num = 0;

            while (n > 0) {
                num++;

                if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                    continue;
                }

                n--;
            }

            answer = num;

            return answer;
        }
    }
}