package Lv0;

import java.util.Scanner;

public class ex120816 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ex120816 outer = new ex120816();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, m);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int slice, int n) {
            int answer = 0;

            answer = n / slice;

            if (0 < n % slice)
                answer++;


            return answer;
        }
    }
}