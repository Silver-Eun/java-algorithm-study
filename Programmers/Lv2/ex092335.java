package Lv2;

import java.util.Scanner;

public class ex092335 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ex092335 outer = new ex092335();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n, int k) {
            int answer = -1;

            String s = Integer.toString(n, k);
            String[] arr = s.split("0");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].isEmpty()) {
                    continue;
                }

                long num = Long.parseLong(arr[i]);

                if (isPrime(num)) {
                    answer++;
                }
            }

            return answer;
        }

        boolean isPrime(long num) {
            if (num < 2) {
                return false;
            }

            for (long i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}