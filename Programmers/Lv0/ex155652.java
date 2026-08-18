package Lv0;

import java.util.Scanner;

public class ex155652 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String a = sc.next();
        int n = sc.nextInt();

        ex155652 outer = new ex155652();
        Solution sol = outer.new Solution();

        String result = sol.solution(s, a, n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String s, String skip, int index) {
            String answer = "";

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);

                for (int j = 0; j < index; j++) {
                    c++;

                    if (c > 'z')
                        c = 'a';

                    while (skip.indexOf(c) != -1) {
                        c++;

                        if (c > 'z')
                            c = 'a';
                    }
                }

                answer += c;
            }

            return answer;
        }
    }
}