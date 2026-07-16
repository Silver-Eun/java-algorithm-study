package Lv0;

import java.util.Scanner;

public class ex120818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120818 outer = new ex120818();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int price) {
            int answer = 0;

            if (500000 <= price)
                answer = (int) (price * 0.80);
            else if (300000 <= price)
                answer = (int) (price * 0.90);
            else if (100000 <= price)
                answer = (int) (price * 0.95);
            else
                answer = price;

            return answer;
        }
    }
}