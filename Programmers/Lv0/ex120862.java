package Lv0;

import java.util.Scanner;

public class ex120862 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120862 outer = new ex120862();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] numbers) {
            int answer = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if (i == j)
                        continue;

                    if (answer < numbers[i] * numbers[j])
                        answer = numbers[i] * numbers[j];
                }
            }

            return answer;
        }
    }
}