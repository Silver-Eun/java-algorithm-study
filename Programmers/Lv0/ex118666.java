package Lv0;

import java.util.Scanner;

public class ex118666 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        ex118666 outer = new ex118666();
        Solution sol = outer.new Solution();

        String result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String[] survey, int[] choices) {
            String answer = "";

            String[] a = {"R", "T", "C", "F", "J", "M", "A", "N"};
            int[] b = {0, 0, 0, 0, 0, 0, 0, 0};

            for (int i = 0; i < survey.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (choices[i] < 4) {
                        if (String.valueOf(survey[i].charAt(0)).equals(a[j]))
                            b[j] += Math.abs(choices[i] - 4);
                    } else if (4 < choices[i]) {
                        if (String.valueOf(survey[i].charAt(1)).equals(a[j]))
                            b[j] += Math.abs(choices[i] - 4);
                    }
                }
            }

            for (int i = 0; i < b.length; i += 2) {
                if (b[i] >= b[i + 1])
                    answer += a[i];
                else
                    answer += a[i + 1];
            }

            return answer;
        }
    }
}