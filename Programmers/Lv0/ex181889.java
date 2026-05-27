package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex181889 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] num_list = new int[len];

        for (int i = 0; i < len; i++) {
            num_list[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        ex181889 outer = new ex181889();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(num_list, n);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] num_list, int n) {

            int[] answer = {};

            answer = Arrays.copyOfRange(num_list, 0, n);

            return answer;
        }
    }
}