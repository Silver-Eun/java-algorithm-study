package Lv0;

import java.util.Scanner;

public class ex120585 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120585 outer = new ex120585();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;

            for (int i = 0; i < array.length; i++) {
                if (height < array[i])
                    answer++;
            }

            return answer;
        }
    }
}