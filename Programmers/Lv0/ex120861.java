package Lv0;

import java.util.Scanner;

public class ex120861 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] s = new String[m];
        int[] arr = new int[n];

        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120861 outer = new ex120861();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(s, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = new int[2];

            int maxX = board[0] / 2;
            int maxY = board[1] / 2;

            for (int i = 0; i < keyinput.length; i++) {

                if (keyinput[i].equals("left")) {
                    if (answer[0] > -maxX) {
                        answer[0]--;
                    }
                } else if (keyinput[i].equals("right")) {
                    if (answer[0] < maxX) {
                        answer[0]++;
                    }
                } else if (keyinput[i].equals("up")) {
                    if (answer[1] < maxY) {
                        answer[1]++;
                    }
                } else if (keyinput[i].equals("down")) {
                    if (answer[1] > -maxY) {
                        answer[1]--;
                    }
                }
            }

            return answer;
        }
    }
}