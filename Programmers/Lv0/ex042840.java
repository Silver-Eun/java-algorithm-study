package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex042840 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex042840 outer = new ex042840();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] answers) {
            int[] p1 = {1, 2, 3, 4, 5};
            int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            int score1 = 0;
            int score2 = 0;
            int score3 = 0;

            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == p1[i % p1.length])
                    score1++;

                if (answers[i] == p2[i % p2.length])
                    score2++;

                if (answers[i] == p3[i % p3.length])
                    score3++;
            }

            int max = Math.max(score1, Math.max(score2, score3));

            ArrayList<Integer> list = new ArrayList<>();

            if (score1 == max)
                list.add(1);

            if (score2 == max)
                list.add(2);

            if (score3 == max)
                list.add(3);

            int[] answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}