package Lv0;

import java.util.Scanner;

public class ex181868 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ex181868 outer = new ex181868();
        ex181868.Solution sol = outer.new Solution();

        String[] result = sol.solution(s);

        for (String str : result) {
            System.out.print(str + " ");
        }

        sc.close();
    }

    class Solution {
        public String[] solution(String my_string) {
            String[] answer = my_string.trim().split(" +");
            return answer;
        }
    }
}