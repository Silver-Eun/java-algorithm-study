package Lv0;

import java.util.Scanner;

public class ex120845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] box = new int[n];

        for (int i = 0; i < box.length; i++) {
            box[i] = sc.nextInt();
        }

        int N = sc.nextInt();

        ex120845 outer = new ex120845();
        Solution sol = outer.new Solution();

        int result = sol.solution(box, N);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] box, int n) {
            int answer = 1;

            for (int i = 0; i < box.length; i++) {
                answer *= box[i] / n;
            }

            return answer;
        }
    }
}