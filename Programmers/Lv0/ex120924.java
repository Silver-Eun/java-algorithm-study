package Lv0;

import java.util.Scanner;

public class ex120924 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i] = sc.nextInt();
            }
        }

        ex120924 outer = new ex120924();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] common) {
            int answer = 0;

            if (common[1] - common[0] == common[2] - common[1])
                answer = common[common.length - 1] + (common[1] - common[0]);
            else if (common[1] / common[0] == common[2] / common[1])
                answer = common[common.length - 1] * (common[1] / common[0]);

            return answer;
        }
    }
}