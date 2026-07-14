package Lv0;

import java.util.Scanner;

public class ex120824 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120824 outer = new ex120824();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0)
                    answer[0]++;
                else
                    answer[1]++;
            }

            return answer;
        }
    }
}