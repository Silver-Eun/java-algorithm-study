package Lv0;

import java.util.Scanner;

public class ex012926 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        ex012926 outer = new ex012926();
        ex012926.Solution sol = outer.new Solution();

        String result = sol.solution(s, n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String s, int n) {
            String answer = "";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == ' ') {
                    answer += ' ';
                } else if (c >= 'A' && c <= 'Z') {
                    if (c + n > 'Z')
                        answer += (char) (c + n - 26);
                    else
                        answer += (char) (c + n);
                } else {
                    if (c + n > 'z')
                        answer += (char) (c + n - 26);
                    else
                        answer += (char) (c + n);
                }
            }

            return answer;
        }
    }
}