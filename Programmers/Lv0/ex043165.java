package Lv0;

import java.util.Scanner;

public class ex043165 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        ex043165 outer = new ex043165();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        int[] numbers;
        int target;
        int answer = 0;

        public int solution(int[] numbers, int target) {
            this.numbers = numbers;
            this.target = target;

            dfs(0, 0);

            return answer;
        }

        void dfs(int index, int sum) {
            if (index == numbers.length) {
                if (sum == target) {
                    answer++;
                }
                return;
            }

            dfs(index + 1, sum + numbers[index]);
            dfs(index + 1, sum - numbers[index]);
        }
    }
}