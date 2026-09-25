package Lv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex042587 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        ex042587 outer = new ex042587();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr, n);

        System.out.println(result);

        sc.close();
    }


    class Solution {
        public int solution(int[] priorities, int location) {
            Queue<int[]> queue = new LinkedList<>();

            for (int i = 0; i < priorities.length; i++) {
                queue.offer(new int[]{priorities[i], i});
            }

            int answer = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                boolean higher = false;

                for (int[] process : queue) {
                    if (process[0] > current[0]) {
                        higher = true;
                        break;
                    }
                }

                if (higher) {
                    queue.offer(current);
                } else {
                    answer++;

                    if (current[1] == location) {
                        return answer;
                    }
                }
            }

            return answer;
        }
    }
}