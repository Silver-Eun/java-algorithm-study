package Lv0;

import java.util.Scanner;

public class ex181840 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] int_list = new int[n];

        for (int i = 0; i < n; i++) {
            int_list[i] = sc.nextInt();
        }

        int ex = sc.nextInt();

        ex181840 outer = new ex181840();
        Solution sol = outer.new Solution();

        int result = sol.solution(int_list, ex);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] num_list, int n) {
            int answer = 0;

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] == n) {
                    answer = 1;
                    break;
                }
            }

            return answer;
        }
    }
}