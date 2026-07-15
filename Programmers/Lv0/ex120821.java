package Lv0;

import java.util.Scanner;

public class ex120821 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120821 outer = new ex120821();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];

            for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[num_list.length - 1 - i];
            }

            return answer;
        }
    }
}