package Lv0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex120835 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120835 outer = new ex120835();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] emergency) {
            int[] answer = new int[emergency.length];

            Integer[] sorted = new Integer[emergency.length];
            for (int i = 0; i < emergency.length; i++) {
                sorted[i] = emergency[i];
            }

            Arrays.sort(sorted, Collections.reverseOrder());

            for (int i = 0; i < emergency.length; i++) {
                for (int j = 0; j < sorted.length; j++) {
                    if (emergency[i] == sorted[j]) {
                        answer[i] = j + 1;
                        break;
                    }
                }
            }

            return answer;
        }
    }
}