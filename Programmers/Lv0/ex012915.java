package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex012915 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        int m = sc.nextInt();

        ex012915 outer = new ex012915();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(s, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String[] solution(String[] strings, int n) {
            Arrays.sort(strings, (a, b) -> {
                if (a.charAt(n) == b.charAt(n)) {
                    return a.compareTo(b);
                }

                return a.charAt(n) - b.charAt(n);
            });

            return strings;
        }
    }
}