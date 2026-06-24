package Lv0;

import java.util.Scanner;

public class ex120905 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[] numList = new int[m];

        for (int i = 0; i < numList.length; i++) {
            numList[i] = sc.nextInt();
        }

        ex120905 outer = new ex120905();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n, numList);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int n, int[] numlist) {
            int idx = 0;

            for (int i = 0; i < numlist.length; i++) {
                if (numlist[i] % n == 0)
                    idx++;
            }

            int[] answer = new int[idx];

            int idx1 = 0;

            for (int i = 0; i < numlist.length; i++) {
                if (numlist[i] % n == 0) {
                    answer[idx1] = numlist[i];
                    idx1++;
                }
            }

            return answer;
        }
    }
}