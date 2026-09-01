package Lv0;

import java.util.*;

public class ex138476 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ex138476 outer = new ex138476();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, a);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for (int t : tangerine) {
                map.put(t, map.getOrDefault(t, 0) + 1);
            }

            List<Integer> counts = new ArrayList<>(map.values());
            Collections.sort(counts, Collections.reverseOrder());

            int sum = 0;

            for (int i = 0; i < counts.size(); i++) {
                sum += counts.get(i);
                answer++;

                if (sum >= k) {
                    break;
                }
            }

            return answer;
        }
    }
}