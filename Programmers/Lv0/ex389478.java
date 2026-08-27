package Lv0;

import java.util.Scanner;

public class ex389478 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        ex389478 outer = new ex389478();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, m, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n, int w, int num) {
            int row = (num - 1) / w;
            int pos = (num - 1) % w;

            int col;

            if (row % 2 == 0) {
                col = pos;
            } else {
                col = w - 1 - pos;
            }

            int lastRow = (n - 1) / w;
            int lastCount = n - lastRow * w;

            int answer = 1;

            if (lastRow > row) {
                answer += lastRow - row - 1;

                if (lastRow % 2 == 0) {
                    if (col < lastCount) {
                        answer++;
                    }
                } else {
                    if (col >= w - lastCount) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}