package Lv0;

import java.util.Scanner;

public class ex120820 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120820 outer = new ex120820();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int age) {
            int answer = 2022 - age + 1;
            return answer;
        }
    }
}