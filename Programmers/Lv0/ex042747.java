package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex042747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        ex042747 outer = new ex042747();
        Solution sol = outer.new Solution();

        int result = sol.solution(array);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] citations) {
            int answer = 0;

            Arrays.sort(citations);

            for (int i = 0; i < citations.length; i++) {
                int h = citations.length - i;

                if (h <= citations[i]) {
                    answer = h;
                    break;
                }
            }

            return answer;
        }
    }
}