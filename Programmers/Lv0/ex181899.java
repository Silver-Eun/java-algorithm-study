package Lv0;

import java.util.Scanner;

public class ex181899 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start_num = sc.nextInt();

        int end_num = sc.nextInt();

        ex181899 outer = new ex181899();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(start_num, end_num);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int start_num, int end_num) {
            int[] answer = new int[start_num - end_num + 1];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = start_num--;
            }

            return answer;
        }
    }
}