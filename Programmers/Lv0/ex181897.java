package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex181897 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] slicer = new int[3];
        for (int i = 0; i < 3; i++) {
            slicer[i] = sc.nextInt();
        }

        int len = sc.nextInt();

        int[] num_list = new int[len];
        for (int i = 0; i < len; i++) {
            num_list[i] = sc.nextInt();
        }

        ex181897 outer = new ex181897();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n, slicer, num_list);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int n, int[] slicer, int[] num_list) {

            int a = slicer[0];
            int b = slicer[1];
            int c = slicer[2];

            if (n == 1) {
                return Arrays.copyOfRange(num_list, 0, b + 1);
            } else if (n == 2) {
                return Arrays.copyOfRange(num_list, a, num_list.length);
            } else if (n == 3) {
                return Arrays.copyOfRange(num_list, a, b + 1);
            } else {
                List<Integer> list = new ArrayList<>();

                for (int i = a; i <= b; i += c) {
                    list.add(num_list[i]);
                }

                int[] answer = new int[list.size()];

                for (int i = 0; i < list.size(); i++) {
                    answer[i] = list.get(i);
                }

                return answer;
            }
        }
    }
}