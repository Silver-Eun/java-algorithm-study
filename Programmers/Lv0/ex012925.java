package Lv0;

import java.util.Scanner;

public class ex012925 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex012925 outer = new ex012925();
        Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String s) {
            return Integer.parseInt(s);
        }
    }
}