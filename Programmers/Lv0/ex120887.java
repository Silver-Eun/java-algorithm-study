package Lv0;

import java.util.Scanner;

public class ex120887 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        ex120887 outer = new ex120887();
        ex120887.Solution sol = outer.new Solution();

        int result = sol.solution(i, j, k);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;

            for (int I = i; I <= j; I++) {
                String s = String.valueOf(I);

                for (int J = 0; J < s.length(); J++) {
                    if (s.charAt(J) - '0' == k)
                        answer++;
                }
            }

            return answer;
        }
    }
}