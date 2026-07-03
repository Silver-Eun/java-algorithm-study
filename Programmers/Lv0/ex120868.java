package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120868 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex120868 outer = new ex120868();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] sides) {
            return Math.min(sides[0], sides[1]) * 2 - 1;
        }
    }
}