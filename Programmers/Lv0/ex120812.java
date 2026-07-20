package Lv0;

import java.util.Scanner;

public class ex120812 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120812 outer = new ex120812();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] array) {
            int[] count = new int[1001];

            for (int n : array) {
                count[n]++;
            }

            int max = 0;
            int answer = -1;

            for (int i = 0; i < count.length; i++) {
                if (count[i] > max) {
                    max = count[i];
                    answer = i;
                } else if (count[i] == max && max != 0) {
                    answer = -1;
                }
            }

            return answer;
        }
    }
}