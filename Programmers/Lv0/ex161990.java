package Lv0;

import java.util.Scanner;

public class ex161990 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        ex161990 outer = new ex161990();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String[] wallpaper) {
            int minRow = wallpaper.length;
            int minCol = wallpaper[0].length();
            int maxRow = 0;
            int maxCol = 0;

            for (int i = 0; i < wallpaper.length; i++) {
                for (int j = 0; j < wallpaper[i].length(); j++) {
                    if (wallpaper[i].charAt(j) == '#') {
                        minRow = Math.min(minRow, i);
                        minCol = Math.min(minCol, j);
                        maxRow = Math.max(maxRow, i + 1);
                        maxCol = Math.max(maxCol, j + 1);
                    }
                }
            }

            return new int[]{minRow, minCol, maxRow, maxCol};
        }
    }
}