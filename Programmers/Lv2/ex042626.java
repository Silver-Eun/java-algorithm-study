package Lv2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ex042626 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        ex042626 outer = new ex042626();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int n : scoville) {
                pq.offer(n);
            }

            while (pq.size() >= 2 && pq.peek() < K) {
                int first = pq.poll();
                int second = pq.poll();

                int mixed = first + second * 2;
                pq.offer(mixed);

                answer++;
            }

            if (pq.peek() < K) {
                return -1;
            }

            return answer;
        }
    }
}