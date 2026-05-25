package Lv0;

import java.util.Scanner;

public class ex181896 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] num_list = new int[n];

        for (int i = 0; i < n; i++) {
            num_list[i] = sc.nextInt();
        }

        ex181896 outer = new ex181896();
        Solution sol = outer.new Solution();

        int result = sol.solution(num_list);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;

            boolean b = false;

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] < 0) {
                    answer = i;
                    b = true;
                    break;
                }
            }

            if (!b)
                answer = -1;

            return answer;
        }
    }
}