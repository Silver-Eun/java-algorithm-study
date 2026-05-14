package Lv0;

import java.util.Scanner;

public class ex181927 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_list = {3, 4, 5, 2, 1};

        ex181927 outer = new ex181927();
        ex181927.Solution sol = outer.new Solution();

        int[] result = sol.solution(num_list);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length + 1];

            for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
            }

            int last = num_list[num_list.length - 1];
            int prev = num_list[num_list.length - 2];

            if (last > prev) {
                answer[num_list.length] = last - prev;
            } else {
                answer[num_list.length] = last * 2;
            }

            return answer;
        }
    }
}