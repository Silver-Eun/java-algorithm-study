package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex181918 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex181918 outer = new ex181918();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }


    class Solution {
        public int[] solution(int[] arr) {
            ArrayList<Integer> stk = new ArrayList<>();
            int i = 0;

            while (i < arr.length) {
                if (stk.isEmpty()) {
                    stk.add(arr[i]);
                    i++;
                } else if (stk.get(stk.size() - 1) < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(stk.size() - 1);
                }
            }

            int[] answer = new int[stk.size()];
            for (int j = 0; j < stk.size(); j++) {
                answer[j] = stk.get(j);
            }

            return answer;
        }
    }
}