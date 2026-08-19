package Lv0;

import java.util.Scanner;

public class ex160586 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        int m = sc.nextInt();
        String[] b = new String[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.next();
        }

        ex160586 outer = new ex160586();
        ex160586.Solution sol = outer.new Solution();

        int[] result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];

            for (int i = 0; i < targets.length; i++) {

                for (int j = 0; j < targets[i].length(); j++) {
                    int min = Integer.MAX_VALUE;
                    for (int k = 0; k < keymap.length; k++) {
                        for (int l = 0; l < keymap[k].length(); l++) {
                            if (targets[i].charAt(j) == keymap[k].charAt(l)) {
                                min = Math.min(min, l + 1);
                            }
                        }
                    }
                    if (min == Integer.MAX_VALUE) {
                        answer[i] = -1;
                        break;
                    }
                    answer[i] += min;
                }
            }

            return answer;
        }
    }
}