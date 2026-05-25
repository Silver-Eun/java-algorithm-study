package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex181894 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex181894 outer = new ex181894();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr) {

            int start = -1;
            int end = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 2) {
                    start = i;
                    break;
                }
            }

            if (start == -1) {
                return new int[]{-1};
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == 2) {
                    end = i;
                    break;
                }
            }

            return Arrays.copyOfRange(arr, start, end + 1);
        }
    }
}