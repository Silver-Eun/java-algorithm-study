package Lv0;

import java.util.Scanner;

public class ex340199 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr1 = new int[m];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        ex340199 outer = new ex340199();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr, arr1);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] wallet, int[] bill) {
            int answer = 0;

            int minWallet = Math.min(wallet[0], wallet[1]);
            int maxWallet = Math.max(wallet[0], wallet[1]);

            while (Math.min(bill[0], bill[1]) > minWallet ||
                    Math.max(bill[0], bill[1]) > maxWallet) {

                if (bill[0] > bill[1]) {
                    bill[0] /= 2;
                } else {
                    bill[1] /= 2;
                }

                answer++;
            }

            return answer;
        }
    }
}