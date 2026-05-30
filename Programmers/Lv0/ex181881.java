package Lv0;

import java.util.Scanner;

public class ex181881 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        ex181881 outer = new ex181881();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] arr) {

            int answer = 0;

            while (true) {

                int[] next = new int[arr.length];

                for (int i = 0; i < arr.length; i++) {

                    if (arr[i] >= 50 && arr[i] % 2 == 0) {
                        next[i] = arr[i] / 2;
                    } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                        next[i] = arr[i] * 2 + 1;
                    } else {
                        next[i] = arr[i];
                    }
                }

                boolean same = true;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != next[i]) {
                        same = false;
                        break;
                    }
                }

                if (same) {
                    return answer;
                }

                arr = next;
                answer++;
            }
        }
    }
}