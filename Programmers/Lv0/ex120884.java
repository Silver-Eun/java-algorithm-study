package Lv0;

import java.util.Scanner;

public class ex120884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        ex120884 outer = new ex120884();
        ex120884.Solution sol = outer.new Solution();

        int result = sol.solution(a);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int chicken) {
            int answer = 0;

            while(10 <= chicken) {
                int service = chicken / 10;
                answer += service;
                chicken = chicken % 10 + service;
            }

            return answer;
        }
    }
}