package Lv0;

import java.util.Scanner;

public class ex070128 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        ex070128 outer = new ex070128();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] a, int[] b) {
            int answer = 0;

            for (int i = 0; i < a.length; i++) {
                answer += a[i] * b[i];
            }

            return answer;
        }
    }
}