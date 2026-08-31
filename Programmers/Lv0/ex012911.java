package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex012911 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012911 outer = new ex012911();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int count = Integer.bitCount(n);
            int num = n + 1;

            while (true) {
                if (Integer.bitCount(num) == count)
                    return num;

                num++;
            }
        }
    }
}