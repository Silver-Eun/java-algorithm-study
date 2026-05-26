package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex181893 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        int[] query = new int[q];

        for (int i = 0; i < q; i++) {
            query[i] = sc.nextInt();
        }

        ex181893 outer = new ex181893();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, query);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int[] query) {

            for (int i = 0; i < query.length; i++) {

                if (i % 2 == 0) {
                    arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
                }

                else {
                    arr = Arrays.copyOfRange(arr, query[i], arr.length);
                }
            }

            return arr;
        }
    }
}