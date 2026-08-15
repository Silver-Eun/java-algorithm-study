package Lv0;

import java.util.Scanner;

public class ex161989 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[l];

        for (int i = 0; i < l; i++) {
            arr[l] = sc.nextInt();
        }

        ex161989 outer = new ex161989();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, m, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0;

            int painted = 0;

            for (int i = 0; i < section.length; i++) {
                if (section[i] > painted) {
                    answer++;
                    painted = section[i] + m - 1;
                }
            }

            return answer;
        }
    }
}