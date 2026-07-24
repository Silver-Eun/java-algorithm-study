package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex012933 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        ex012933 outer = new ex012933();
        Solution sol = outer.new Solution();

        long result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public long solution(long n) {
            char[] arr = String.valueOf(n).toCharArray();

            Arrays.sort(arr);

            StringBuilder sb = new StringBuilder();

            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }

            return Long.parseLong(sb.toString());
        }
    }
}