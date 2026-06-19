package Lv0;

import java.util.Scanner;

public class ex120923 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int total = sc.nextInt();

        ex120923 outer = new ex120923();
        Solution sol = outer.new Solution();

        int result[] = sol.solution(num, total);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int num, int total) {

            int[] answer = new int[num];

            int start = total / num - (num - 1) / 2;

            for (int i = 0; i < num; i++) {
                answer[i] = start + i;
            }

            return answer;
        }
    }
}