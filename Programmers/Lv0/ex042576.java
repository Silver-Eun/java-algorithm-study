package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex042576 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        int m = sc.nextInt();

        String[] b = new String[n];

        for (int i = 0; i < m; i++) {
            b[i] = sc.next();
        }

        ex042576 outer = new ex042576();
        Solution sol = outer.new Solution();

        String result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    import java.util.Arrays;

    class Solution {
        public String solution(String[] participant, String[] completion) {

            Arrays.sort(participant);
            Arrays.sort(completion);

            for (int i = 0; i < completion.length; i++) {
                if (!participant[i].equals(completion[i])) {
                    return participant[i];
                }
            }

            return participant[participant.length - 1];
        }
    }
}