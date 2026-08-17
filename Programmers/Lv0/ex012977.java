package Lv0;

import java.util.Scanner;

public class ex012977 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex012977 outer = new ex012977();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {

                        int sum = nums[i] + nums[j] + nums[k];

                        boolean isPrime = true;

                        for (int x = 2; x * x <= sum; x++) {
                            if (sum % x == 0) {
                                isPrime = false;
                                break;
                            }
                        }

                        if (isPrime) {
                            answer++;
                        }
                    }
                }
            }

            return answer;
        }
    }
}