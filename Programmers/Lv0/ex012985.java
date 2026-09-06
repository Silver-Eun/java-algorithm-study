package Lv0;

import java.util.HashMap;
import java.util.Scanner;

public class ex012985 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr1 = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        String[] arr3 = new String[n];
        for (int i = 0; i < k; i++) {
            arr3[i] = sc.next();
        }

        ex012985 outer = new ex012985();
        ex012985.Solution sol = outer.new Solution();

        int result = sol.solution(arr1, arr2, arr3);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;

            HashMap<String, Integer> wantMap = new HashMap<>();

            for (int i = 0; i < want.length; i++) {
                wantMap.put(want[i], number[i]);
            }

            for (int i = 0; i <= discount.length - 10; i++) {
                HashMap<String, Integer> map = new HashMap<>();

                for (int j = i; j < i + 10; j++) {
                    map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
                }

                if (wantMap.equals(map)) {
                    answer++;
                }
            }

            return answer;
        }
    }
}