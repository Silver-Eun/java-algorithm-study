package Lv0;

import java.util.Scanner;

public class ex012953 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex012953 outer = new ex012953();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] arr) {
            int answer = arr[0];

            for (int i = 1; i < arr.length; i++) {
                answer = answer / gcd(answer, arr[i]) * arr[i];
            }

            return answer;
        }

        int gcd(int a, int b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
    }
}