package Lv0;

import java.util.Scanner;

public class ex120875 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] lines = new int[3][2];

        for (int i = 0; i < 3; i++) {
            lines[i][0] = sc.nextInt();
            lines[i][1] = sc.nextInt();
        }

        ex120875 outer = new ex120875();
        Solution sol = outer.new Solution();

        int result = sol.solution(lines);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[][] dots) {

            if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
            if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
            if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;

            return 0;
        }

        public boolean isParallel(int[] a, int[] b, int[] c, int[] d) {

            return (b[1] - a[1]) * (d[0] - c[0])
                    == (d[1] - c[1]) * (b[0] - a[0]);
        }
    }
}