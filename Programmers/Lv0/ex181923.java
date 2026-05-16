package Lv0;

import java.util.Scanner;

public class ex181923 {

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

        ex181923 outer = new ex181923();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, queries);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];

            for (int i = 0; i < queries.length; i++) {
                int s = queries[i][0];
                int e = queries[i][1];
                int k = queries[i][2];

                int min = Integer.MAX_VALUE;

                for (int j = s; j <= e; j++) {
                    if (arr[j] > k && arr[j] < min) {
                        min = arr[j];
                    }
                }

                if (min == Integer.MAX_VALUE) {
                    answer[i] = -1;
                } else {
                    answer[i] = min;
                }
            }

            return answer;
        }
    }
}