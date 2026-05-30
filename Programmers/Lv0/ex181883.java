package Lv0;

import java.util.Scanner;

public class ex181883 {

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
            queries[i][0] = sc.nextInt(); // s
            queries[i][1] = sc.nextInt(); // e
        }

        ex181883 outer = new ex181883();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, queries);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = {};

            for (int i = 0; i < queries.length; i++) {

                for (int j = 0; j < arr.length; j++) {
                    if (queries[i][0] <= j && j <= queries[i][1])
                        arr[j]++;
                }
            }

            answer = arr;

            return answer;
        }
    }
}