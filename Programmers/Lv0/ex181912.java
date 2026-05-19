package Lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex181912 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] intStrs = new String[n];

        for (int i = 0; i < n; i++) {
            intStrs[i] = sc.next();
        }

        int k = sc.nextInt();
        int s = sc.nextInt();
        int l = sc.nextInt();

        ex181912 outer = new ex181912();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(intStrs, k, s, l);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(String[] intStrs, int k, int s, int l) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < intStrs.length; i++) {
                int num = Integer.parseInt(intStrs[i].substring(s, s + l));

                if (num > k) {
                    list.add(num);
                }
            }

            // List → 배열 변환
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}