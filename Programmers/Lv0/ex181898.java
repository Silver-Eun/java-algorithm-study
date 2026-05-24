package Lv0;

import java.util.Scanner;

public class ex181898 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = sc.nextInt();

        ex181898 outer = new ex181898();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr, idx);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] arr, int idx) {

            for (int i = idx; i < arr.length; i++) {
                if (arr[i] == 1) {
                    return i;
                }
            }

            return -1;
        }
    }
}