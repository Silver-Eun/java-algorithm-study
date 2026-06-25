package Lv0;

import java.util.Scanner;

public class ex120899 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        ex120899 outer = new ex120899();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(array);

        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] array) {
            int[] answer = new int[2];

            int max = 0;

            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                    answer[0] = array[i];
                    answer[1] = i;
                }
            }

            return answer;
        }
    }
}