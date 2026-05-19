package Lv0;

import java.util.Scanner;

public class ex181913 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();

        int q = sc.nextInt();
        int[][] queries = new int[q][2];

        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        ex181913 outer = new ex181913();
        Solution sol = outer.new Solution();

        String result = sol.solution(my_string, queries);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int[][] queries) {
            char[] arr = my_string.toCharArray();

            for (int[] q : queries) {
                int s = q[0];
                int e = q[1];

                while (s < e) {
                    char temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++;
                    e--;
                }
            }

            return new String(arr);
        }
    }
}