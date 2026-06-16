package Lv0;

import java.util.Scanner;

public class ex181836 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        String[] picture = new String[n];

        for (int i = 0; i < n; i++) {
            picture[i] = sc.nextLine();
        }

        ex181836 outer = new ex181836();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(picture, k);

        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }

    class Solution {
        public String[] solution(String[] picture, int k) {

            String[] answer = new String[picture.length * k];

            int idx = 0;

            for (int i = 0; i < picture.length; i++) {

                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < picture[i].length(); j++) {
                    for (int t = 0; t < k; t++) {
                        sb.append(picture[i].charAt(j));
                    }
                }

                String s = sb.toString();

                for (int t = 0; t < k; t++) {
                    answer[idx++] = s;
                }
            }

            return answer;
        }
    }
}