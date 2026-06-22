package Lv0;

import java.util.Scanner;

public class ex120909 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120909 outer = new ex120909();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            if (Math.sqrt(n) % 1 == 0)
                return 1;
            else
                return 2;
        }
    }
}