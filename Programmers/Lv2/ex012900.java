package Lv2;

import java.util.Scanner;

public class ex012900 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012900 outer = new ex012900();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int[] arr = new int[n + 1];

            arr[1] = 1;
            arr[2] = 2;

            for (int i = 3; i <= n; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
            }

            return arr[n];
        }
    }
}