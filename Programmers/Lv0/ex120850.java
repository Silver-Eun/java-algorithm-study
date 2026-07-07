package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120850 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        ex120850 outer = new ex120850();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String my_string) {
            int idx = 0;

            for (int i = 0; i < my_string.length(); i++) {
                if (Character.isDigit(my_string.charAt(i)))
                    idx++;
            }

            int[] answer = new int[idx];

            int idx1 = 0;

            for (int i = 0; i < my_string.length(); i++) {
                if (Character.isDigit(my_string.charAt(i))) {
                    answer[idx1] = my_string.charAt(i) - '0';
                    idx1++;
                }
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}