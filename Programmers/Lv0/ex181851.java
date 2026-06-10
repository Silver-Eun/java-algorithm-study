package Lv0;

import java.util.Scanner;

public class ex181851 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] rank = new int[n];
        boolean[] attendance = new boolean[n];

        for (int i = 0; i < n; i++) {
            rank[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextBoolean();
        }

        ex181851 outer = new ex181851();
        Solution sol = outer.new Solution();

        int result = sol.solution(rank, attendance);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] rank, boolean[] attendance) {

            int a = -1, b = -1, c = -1;

            for (int i = 0; i < rank.length; i++) {

                if (!attendance[i]) continue;

                if (a == -1 || rank[i] < rank[a]) {
                    c = b;
                    b = a;
                    a = i;
                } else if (b == -1 || rank[i] < rank[b]) {
                    c = b;
                    b = i;
                } else if (c == -1 || rank[i] < rank[c]) {
                    c = i;
                }
            }

            return 10000 * a + 100 * b + c;
        }
    }
}