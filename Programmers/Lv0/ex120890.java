package Lv0;

import java.util.Scanner;

public class ex120890 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120890 outer = new ex120890();
        ex120890.Solution sol = outer.new Solution();

        int result = sol.solution(arr, n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;

            int cnt = n;

            for (int i = 0; i < array.length; i++) {
                int a = Math.abs(n - array[i]);

                if (a < cnt) {
                    cnt = a;
                    answer = array[i];
                } else if (a == cnt && array[i] < answer) {
                    answer = array[i];
                }
            }
            return answer;
        }
    }
}