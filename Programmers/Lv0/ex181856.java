package Lv0;

import java.util.Scanner;

public class ex181856 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        ex181856 outer = new ex181856();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] arr1, int[] arr2) {

            if (arr1.length > arr2.length) {
                return 1;
            }

            if (arr1.length < arr2.length) {
                return -1;
            }

            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
            }

            for (int i = 0; i < arr2.length; i++) {
                sum2 += arr2[i];
            }

            return sum1 == sum2 ? 0 : (sum1 > sum2 ? 1 : -1);
        }
    }
}