package Lv0;

import java.util.Scanner;

public class ex120921 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        ex120921 outer = new ex120921();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String A, String B) {

            for (int i = 0; i < A.length(); i++) {

                if (A.equals(B))
                    return i;

                A = A.charAt(A.length() - 1)
                        + A.substring(0, A.length() - 1);
            }

            return -1;
        }
    }
}