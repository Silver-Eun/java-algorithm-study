package Lv2;

import java.util.Scanner;

public class ex118667 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        ex118667 outer = new ex118667();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] queue1, int[] queue2) {
            int answer = 0;

            long sum1 = 0;
            long sum2 = 0;

            for (int i = 0; i < queue1.length; i++) {
                sum1 += queue1[i];
                sum2 += queue2[i];
            }

            if ((sum1 + sum2) % 2 != 0) {
                answer = -1;
            } else {
                int len = queue1.length;
                int[] arr = new int[len * 2];

                for (int i = 0; i < len; i++) {
                    arr[i] = queue1[i];
                    arr[i + len] = queue2[i];
                }

                long target = (sum1 + sum2) / 2;
                int left = 0;
                int right = len;

                while (answer <= 4 * len) {
                    if (sum1 == target) {
                        return answer;
                    } else if (sum1 < target) {
                        sum1 += arr[right % arr.length];
                        right++;
                        answer++;
                    } else {
                        sum1 -= arr[left % arr.length];
                        left++;
                        answer++;
                    }
                }

                return -1;
            }

            return answer;
        }
    }
}