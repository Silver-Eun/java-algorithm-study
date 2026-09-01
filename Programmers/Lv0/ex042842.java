package Lv0;

import java.util.Scanner;

public class ex042842 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ex042842 outer = new ex042842();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int brown, int yellow) {
            int total = brown + yellow;

            for (int height = 3; height <= total; height++) {
                if (total % height == 0) {
                    int width = total / height;

                    if ((width - 2) * (height - 2) == yellow) {
                        return new int[]{width, height};
                    }
                }
            }

            return null;
        }
    }
}