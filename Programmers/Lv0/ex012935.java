package Lv0;

import java.util.Scanner;

public class ex012935 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex012935 outer = new ex012935();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr) {

            if (arr.length == 1) {
                return new int[]{-1};
            }

            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            int[] answer = new int[arr.length - 1];
            int idx = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    answer[idx++] = arr[i];
                }
            }

            return answer;
        }
    }
}