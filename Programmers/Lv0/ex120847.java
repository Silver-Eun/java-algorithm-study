package Lv0;

import java.util.Scanner;

public class ex120847 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] n = new int[N];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        ex120847 outer = new ex120847();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if (i == j)
                        continue;

                    if (answer < numbers[i] * numbers[j])
                        answer = numbers[i] * numbers[j];
                }
            }

            return answer;
        }
    }
}