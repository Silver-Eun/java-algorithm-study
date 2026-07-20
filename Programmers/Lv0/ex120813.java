package Lv0;

import java.util.Scanner;

public class ex120813 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120813 outer = new ex120813();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int n) {
            int N = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1)
                    N++;
            }

            int[] answer = new int[N];

            int idx = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    answer[idx] = i;
                    idx++;
                }
            }

            return answer;
        }
    }
}