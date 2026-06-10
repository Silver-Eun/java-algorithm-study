package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex181852 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        ex181852 outer = new ex181852();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] num_list) {
            Arrays.sort(num_list);

            return Arrays.copyOfRange(num_list, 5, num_list.length);
        }
    }
}