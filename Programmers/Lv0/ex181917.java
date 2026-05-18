package Lv0;

import java.util.Scanner;

public class ex181917 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean x1 = sc.nextBoolean();
        boolean x2 = sc.nextBoolean();
        boolean x3 = sc.nextBoolean();
        boolean x4 = sc.nextBoolean();

        ex181917 outer = new ex181917();
        Solution sol = outer.new Solution();

        boolean result = sol.solution(x1, x2, x3, x4);
        System.out.println(result);
        
        sc.close();
    }


    class Solution {
        public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
            boolean answer = true;

            boolean a = true;
            boolean b = true;

            if (!x1 && !x2)
                a = false;

            if (!x3 && !x4)
                b = false;

            if (!a || !b)
                answer = false;

            return answer;
        }
    }
}