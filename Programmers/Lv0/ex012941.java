package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex012941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        ex012941 outer = new ex012941();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] A, int[] B) {
            int answer = 0;

            Arrays.sort(A);
            Arrays.sort(B);

            for (int i = 0; i < A.length; i++) {
                answer += A[i] * B[A.length - i - 1];
            }

            return answer;
        }
    }
}