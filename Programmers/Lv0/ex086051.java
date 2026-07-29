package Lv0;

import java.util.Scanner;

public class ex086051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] absolutes = new int[n];

        for (int i = 0; i < n; i++) {
            absolutes[i] = sc.nextInt();
        }

        ex086051 outer = new ex086051();
        Solution sol = outer.new Solution();

        int result = sol.solution(absolutes);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;

            for (int i = 0; i <= 9; i++) {
                boolean found = false;

                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == i) {
                        found = true;
                        break;
                    }
                }

                if (!found)
                    answer += i;
            }

            return answer;
        }
    }
}