package Lv0;

import java.util.Scanner;

public class ex120912 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120912 outer = new ex120912();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] array) {
            int answer = 0;

            for (int i = 0; i < array.length; i++) {
                String s = String.valueOf(array[i]);

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '7') {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}