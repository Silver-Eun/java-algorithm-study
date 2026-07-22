package Lv0;

import java.util.Scanner;

public class ex120583 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120583 outer = new ex120583();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == n)
                    answer++;
            }

            return answer;
        }
    }
}