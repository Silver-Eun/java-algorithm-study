package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex042586 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr1 = new int[m];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();

        }

        ex042586 outer = new ex042586();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, arr1);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            ArrayList<Integer> list = new ArrayList<>();

            int cnt = 1;
            int maxDays = (100 - progresses[0] + speeds[0] - 1) / speeds[0];

            for (int i = 1; i < progresses.length; i++) {
                int days = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

                if (days <= maxDays) {
                    cnt++;
                } else {
                    list.add(cnt);
                    cnt = 1;
                    maxDays = days;
                }
            }

            list.add(cnt);

            int[] answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}