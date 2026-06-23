package Lv0;

import java.util.Scanner;

public class ex120907 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n];

        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }

        ex120907 outer = new ex120907();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String[] solution(String[] quiz) {

            String[] answer = new String[quiz.length];

            for (int i = 0; i < quiz.length; i++) {

                String[] arr = quiz[i].split(" ");

                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[2]);
                int z = Integer.parseInt(arr[4]);

                int result;

                if (arr[1].equals("+")) {
                    result = x + y;
                } else {
                    result = x - y;
                }

                answer[i] = (result == z) ? "O" : "X";
            }

            return answer;
        }
    }
}