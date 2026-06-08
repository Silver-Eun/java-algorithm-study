package Lv0;

import java.util.Scanner;

public class ex181858 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        ex181858 outer = new ex181858();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, k);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int k) {

            int[] answer = new int[k];

            for (int i = 0; i < k; i++) {
                answer[i] = -1;
            }

            int idx = 0;

            for (int i = 0; i < arr.length; i++) {

                boolean exists = false;

                for (int j = 0; j < idx; j++) {
                    if (answer[j] == arr[i]) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    answer[idx++] = arr[i];
                }

                if (idx == k) {
                    break;
                }
            }

            return answer;
        }
    }
}