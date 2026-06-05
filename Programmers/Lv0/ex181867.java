package Lv0;

import java.util.Scanner;

public class ex181867 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ex181867 outer = new ex181867();
        ex181867.Solution sol = outer.new Solution();

        int[] result = sol.solution(s);

        for (int str : result) {
            System.out.print(str + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(String myString) {
            String[] a = myString.split("x", -1);

            int[] answer = new int[a.length];

            for(int i = 0; i < a.length; i++) {
                answer[i] = a[i].length();
            }

            return answer;
        }
    }
}