package Lv0;

import java.util.Scanner;

public class ex181900 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();

        int n = sc.nextInt();

        int[] indices = new int[n];

        for (int i = 0; i < n; i++) {
            indices[i] = sc.nextInt();
        }

        ex181900 outer = new ex181900();
        Solution sol = outer.new Solution();

        String result = sol.solution(my_string, indices);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int[] indices) {

            String answer = "";

            boolean[] remove = new boolean[my_string.length()];

            for (int idx : indices) {
                remove[idx] = true;
            }

            for (int i = 0; i < my_string.length(); i++) {
                if (!remove[i]) {
                    answer += my_string.charAt(i);
                }
            }

            return answer;
        }
    }
}