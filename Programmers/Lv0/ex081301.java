package Lv0;

import java.util.Scanner;

public class ex081301 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex081301 outer = new ex081301();
        ex081301.Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String s) {

            s = s.replace("zero", "0");
            s = s.replace("one", "1");
            s = s.replace("two", "2");
            s = s.replace("three", "3");
            s = s.replace("four", "4");
            s = s.replace("five", "5");
            s = s.replace("six", "6");
            s = s.replace("seven", "7");
            s = s.replace("eight", "8");
            s = s.replace("nine", "9");

            return Integer.parseInt(s);
        }
    }
}