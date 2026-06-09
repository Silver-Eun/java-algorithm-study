package Lv0;

import java.util.Scanner;

public class ex181854 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        ex181854 outer = new ex181854();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, n);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int n) {
            int[] answer = new int[arr.length];

            if (arr.length % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    if (i % 2 != 0)
                        answer[i] = arr[i] + n;
                    else
                        answer[i] = arr[i];
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (i % 2 == 0)
                        answer[i] = arr[i] + n;
                    else
                        answer[i] = arr[i];
                }
            }

            return answer;
        }
    }
}