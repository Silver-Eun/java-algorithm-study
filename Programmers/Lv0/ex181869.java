package Lv0;

import java.util.Scanner;

public class ex181869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ex181869 outer = new ex181869();
        ex181869.Solution sol = outer.new Solution();

        String[] result = sol.solution(s);

        for (String str : result) {
            System.out.print(str + " ");
        }

        sc.close();
    }

    class Solution {
        public String[] solution(String my_string) {
            String[] answer = my_string.split(" ");
            return answer;
        }
    }
}