package Lv0;

import java.util.HashSet;
import java.util.Scanner;

public class ex001845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex001845 outer = new ex001845();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }
    class Solution {
        public int solution(int[] nums) {
            HashSet<Integer> set = new HashSet<>();

            for (int num : nums) {
                set.add(num);
            }

            return Math.min(set.size(), nums.length / 2);
        }
    }
}