package Lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex181895 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] intervals = new int[2][2];

        for (int i = 0; i < 2; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        ex181895 outer = new ex181895();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, intervals);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int[][] intervals) {
            List<Integer> list = new ArrayList<>();

            for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
                list.add(arr[i]);
            }

            for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
                list.add(arr[i]);
            }

            int[] answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}