package Lv0;

import java.util.Scanner;

public class ex120903 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String[] s1 = new String[n1];

        for (int i = 0; i < n1; i++) {
            s1[i] = sc.next();
        }

        int n2 = sc.nextInt();
        String[] s2 = new String[n2];

        for (int i = 0; i < n2; i++) {
            s2[i] = sc.next();
        }

        ex120903 outer = new ex120903();
        Solution sol = outer.new Solution();

        int result = sol.solution(s1, s2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String[] s1, String[] s2) {
            int answer = 0;

            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s2.length; j++) {
                    if (s1[i].equals(s2[j]))
                        answer++;
                }
            }

            return answer;
        }
    }
}