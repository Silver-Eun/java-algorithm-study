package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex181859 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex181859 outer = new ex181859();
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

            for (int i = 0; i < arr.length; i++) {

                if (stk.isEmpty()) {
                    stk.add(arr[i]);
                } else if (stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);
                } else {
                    stk.add(arr[i]);
                }
            }

            if (stk.isEmpty()) {
                return new int[]{-1};
            }

            int[] answer = new int[stk.size()];

            for (int i = 0; i < stk.size(); i++) {
                answer[i] = stk.get(i);
            }

            return answer;
        }
    }
}