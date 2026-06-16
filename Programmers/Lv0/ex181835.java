package Lv0;

import java.util.Scanner;

public class ex181835 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        int[] picture = new int[n];

        for (int i = 0; i < n; i++) {
            picture[i] = sc.nextInt();
        }

        ex181835 outer = new ex181835();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(picture, k);

        for (int s : result) {
            System.out.println(s);
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int k) {
            int[] answer = new int[arr.length];

            if(k % 2 == 1) {
                for(int i = 0; i < arr.length; i++) {
                    answer[i] = arr[i] * k;
                }
            } else {
                for(int i = 0; i < arr.length; i++) {
                    answer[i] = arr[i] + k;
                }
            }

            return answer;
        }
    }
}