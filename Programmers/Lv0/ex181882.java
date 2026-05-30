package Lv0;

import java.util.Scanner;

public class ex181882 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        ex181882 outer = new ex181882();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr) {
            int[] answer = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                if (50 <= arr[i] && arr[i] % 2 == 0)
                    arr[i] /= 2;
                else if (arr[i] < 50 && arr[i] % 2 == 1)
                    arr[i] *= 2;

                answer[i] = arr[i];
            }

            return answer;
        }
    }
}