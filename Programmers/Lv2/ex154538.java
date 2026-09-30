package Lv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex154538 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        ex154538 outer = new ex154538();
        ex154538.Solution sol = outer.new Solution();

        int result = sol.solution(n, m, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int x, int y, int n) {
            Queue<Integer> queue = new LinkedList<>();
            int[] count = new int[y + 1];

            queue.offer(x);

            while (!queue.isEmpty()) {
                int current = queue.poll();

                if (current == y) {
                    return count[current];
                }

                int[] next = {current + n, current * 2, current * 3};

                for (int value : next) {
                    if (value <= y && count[value] == 0) {
                        count[value] = count[current] + 1;
                        queue.offer(value);
                    }
                }
            }

            return -1;
        }
    }
}