package Lv0;

import java.util.Scanner;

public class ex068935 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex068935 outer = new ex068935();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            String three = "";

            while (n > 0) {
                three += n % 3;
                n /= 3;
            }

            int answer = 0;
            int power = 1;

            for (int i = three.length() - 1; i >= 0; i--) {
                answer += (three.charAt(i) - '0') * power;
                power *= 3;
            }

            return answer;
        }
    }
}