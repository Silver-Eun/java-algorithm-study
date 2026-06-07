package Lv0;

import java.util.Scanner;

public class ex181861 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex181861 outer = new ex181861();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }


    class Solution {
        public int[] solution(int[] arr) {
            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {
                cnt += arr[i];
            }

            int[] answer = new int[cnt];

            int idx = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i]; j++) {
                    answer[idx++] = arr[i];
                }
            }

            return answer;
        }
    }
}