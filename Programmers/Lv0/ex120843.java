package Lv0;

import java.util.Scanner;

public class ex120843 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] box = new int[n];

        for (int i = 0; i < box.length; i++) {
            box[i] = sc.nextInt();
        }

        int s = sc.nextInt();

        ex120843 outer = new ex120843();
        Solution sol = outer.new Solution();

        int result = sol.solution(box, s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] numbers, int k) {
            return numbers[((k - 1) * 2) % numbers.length];
        }
    }
}