package Lv0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex138477 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex138477 outer = new ex138477();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(k, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < score.length; i++) {
                list.add(score[i]);

                Collections.sort(list);

                if (list.size() > k) {
                    list.remove(0);
                }

                answer[i] = list.get(0);
            }

            return answer;
        }
    }
}