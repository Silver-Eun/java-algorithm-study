package Lv0;

import java.util.Scanner;

public class ex181844 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] delete_list = new int[m];

        for (int i = 0; i < m; i++) {
            delete_list[i] = sc.nextInt();
        }

        ex181844 outer = new ex181844();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, delete_list);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int[] delete_list) {

            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {

                boolean delete = false;

                for (int j = 0; j < delete_list.length; j++) {
                    if (arr[i] == delete_list[j]) {
                        delete = true;
                        break;
                    }
                }

                if (!delete) cnt++;
            }

            int[] answer = new int[cnt];

            int idx = 0;

            for (int i = 0; i < arr.length; i++) {

                boolean delete = false;

                for (int j = 0; j < delete_list.length; j++) {
                    if (arr[i] == delete_list[j]) {
                        delete = true;
                        break;
                    }
                }

                if (!delete) {
                    answer[idx++] = arr[i];
                }
            }

            return answer;
        }
    }
}