package Lv0;

import java.util.Scanner;

public class ex181857 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex181857 outer = new ex181857();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr) {

            int size = 1;

            while (size < arr.length) {
                size *= 2;
            }

            int[] answer = new int[size];

            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
            }

            return answer;
        }
    }
}