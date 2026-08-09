package Lv0;

import java.util.Scanner;

public class ex131705 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex131705 outer = new ex131705();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] number) {
            int answer = 0;

            for (int i = 0; i < number.length - 2; i++) {
                for (int j = i + 1; j < number.length - 1; j++) {
                    for (int k = j + 1; k < number.length; k++) {

                        if (number[i] + number[j] + number[k] == 0) {
                            answer++;
                        }

                    }
                }
            }

            return answer;
        }
    }
}