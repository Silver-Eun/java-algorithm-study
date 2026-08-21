package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex250121 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] data = new int[n][4];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        String ext = sc.next();
        int val_ext = sc.nextInt();
        String sort_by = sc.next();

        ex250121 outer = new ex250121();
        Solution sol = outer.new Solution();

        int[][] result = sol.solution(data, ext, val_ext, sort_by);

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

        sc.close();
    }

    class Solution {
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
            int extIndex = 0;

            if (ext.equals("code")) {
                extIndex = 0;
            } else if (ext.equals("date")) {
                extIndex = 1;
            } else if (ext.equals("maximum")) {
                extIndex = 2;
            } else if (ext.equals("remain")) {
                extIndex = 3;
            }

            int sortIndex;

            if (sort_by.equals("code")) {
                sortIndex = 0;
            } else if (sort_by.equals("date")) {
                sortIndex = 1;
            } else if (sort_by.equals("maximum")) {
                sortIndex = 2;
            } else if (sort_by.equals("remain")) {
                sortIndex = 3;
            } else {
                sortIndex = 0;
            }

            int idx = 0;

            for (int i = 0; i < data.length; i++) {
                if (data[i][extIndex] < val_ext) {
                    idx++;
                }
            }

            int[][] answer = new int[idx][4];

            idx = 0;

            for (int i = 0; i < data.length; i++) {
                if (data[i][extIndex] < val_ext) {
                    answer[idx] = data[i];
                    idx++;
                }
            }

            Arrays.sort(answer, (a, b) -> a[sortIndex] - b[sortIndex]);

            return answer;
        }
    }
}