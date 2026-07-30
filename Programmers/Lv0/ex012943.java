package Lv0;

import java.util.Scanner;

public class ex012943 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex012943 outer = new ex012943();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int num) {
            long n = num;
            int answer = 0;

            while (n != 1) {
                if (n % 2 == 0)
                    n /= 2;
                else
                    n = n * 3 + 1;

                answer++;

                if (answer > 500)
                    return -1;
            }

            return answer;
        }
    }
}