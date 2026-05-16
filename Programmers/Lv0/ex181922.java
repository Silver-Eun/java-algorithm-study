package Lv0;

import java.util.Scanner;

public class ex181922 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[][] queries = new int[q][2];

        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        ex181922 outer = new ex181922();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, queries);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int[][] queries) {

            for (int i = 0; i < queries.length; i++) {
                int s = queries[i][0];
                int e = queries[i][1];
                int k = queries[i][2];

                for (int j = s; j <= e; j++) {
                    if (j % k == 0) {
                        arr[j] += 1;
                    }
                }
            }

            return arr;
        }
    }
}