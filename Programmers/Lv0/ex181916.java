package Lv0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex181916 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        ex181916 outer = new ex181916();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b, c, d);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int a, int b, int c, int d) {
            int[] arr = {a, b, c, d};
            Map<Integer, Integer> map = new HashMap<>();

            // 개수 세기
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            if (map.size() == 1) {
                return 1111 * a;
            }

            if (map.size() == 2) {
                int p = 0, q = 0;

                for (int key : map.keySet()) {
                    if (map.get(key) == 3) p = key;
                    else q = key;
                }

                if (p != 0) {
                    return (int) Math.pow(10 * p + q, 2);
                }

                int[] keys = map.keySet().stream().mapToInt(i -> i).toArray();
                return (keys[0] + keys[1]) * Math.abs(keys[0] - keys[1]);
            }

            if (map.size() == 3) {
                int q = 0, r = 0;

                for (int key : map.keySet()) {
                    if (map.get(key) == 1) {
                        if (q == 0) q = key;
                        else r = key;
                    }
                }

                return q * r;
            }

            return Arrays.stream(arr).min().getAsInt();
        }
    }
}