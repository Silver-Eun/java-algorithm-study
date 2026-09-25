package Lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ex132265 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex132265 outer = new ex132265();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] topping) {
            int answer = 0;

            HashSet<Integer> left = new HashSet<>();
            HashMap<Integer, Integer> right = new HashMap<>();

            for (int x : topping) {
                right.put(x, right.getOrDefault(x, 0) + 1);
            }

            for (int i = 0; i < topping.length - 1; i++) {
                int x = topping[i];

                left.add(x);

                right.put(x, right.get(x) - 1);
                if (right.get(x) == 0) {
                    right.remove(x);
                }

                if (left.size() == right.size()) {
                    answer++;
                }
            }

            return answer;
        }
    }
}