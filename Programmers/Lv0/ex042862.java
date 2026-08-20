package Lv0;

import java.util.Scanner;

public class ex042862 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] b = new int[n];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        ex042862 outer = new ex042862();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;

            int[] clothes = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                clothes[i] = 1;
            }

            for (int i = 0; i < lost.length; i++) {
                clothes[lost[i]]--;
            }

            for (int i = 0; i < reserve.length; i++) {
                clothes[reserve[i]]++;
            }

            for (int i = 1; i <= n; i++) {
                if (clothes[i] == 0) {
                    if (clothes[i - 1] >= 2) {
                        clothes[i - 1]--;
                        clothes[i]++;
                    } else if (i < n && clothes[i + 1] >= 2) {
                        clothes[i + 1]--;
                        clothes[i]++;
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                if (clothes[i] >= 1) {
                    answer++;
                }
            }

            return answer;
        }
    }
}