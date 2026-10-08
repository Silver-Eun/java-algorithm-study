package Lv2;

import java.util.Arrays;
import java.util.Scanner;

public class ex042746 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex042746 outer = new ex042746();
        Solution sol = outer.new Solution();

        String result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int[] numbers) {
            String[] arr = new String[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                arr[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

            if (arr[0].equals("0")) {
                return "0";
            }

            StringBuilder sb = new StringBuilder();

            for (String s : arr) {
                sb.append(s);
            }

            return sb.toString();
        }
    }
}