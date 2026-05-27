package Lv0;

import java.util.Scanner;

public class ex181888 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] num_list = new int[len];

        for (int i = 0; i < len; i++) {
            num_list[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        ex181888 outer = new ex181888();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(num_list, n);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] num_list, int n) {

            int[] answer = new int[(num_list.length + n - 1) / n];

            int idx = 0;

            for (int i = 0; i < num_list.length; i += n) {
                answer[idx++] = num_list[i];
            }

            return answer;
        }
    }
}