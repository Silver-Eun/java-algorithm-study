package Lv0;

import java.util.Scanner;

public class ex012980 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012980 outer = new ex012980();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    public class Solution {
        public int solution(int n) {
            int ans = 0;

            while (0 < n) {
                if (n % 2 == 0)
                    n /= 2;
                else {
                    n -= 1;
                    ans++;
                }
            }

            return ans;
        }
    }
}