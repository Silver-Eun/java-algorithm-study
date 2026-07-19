package Lv0;

import java.util.Scanner;

public class ex120815 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120815 outer = new ex120815();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n) {
            int answer = 1;

            while ((answer * 6) % n != 0) {
                answer++;
            }

            return answer;
        }
    }
}