package Lv0;

import java.util.Scanner;

public class ex120833 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        ex120833 outer = new ex120833();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, num1, num2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2 - num1 + 1];

            for (int i = num1; i <= num2; i++) {
                answer[i - num1] = numbers[i];
            }

            return answer;
        }
    }
}