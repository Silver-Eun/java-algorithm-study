package Lv0;

import java.util.Scanner;

public class ex120819 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        ex120819 outer = new ex120819();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];

            answer[0] = money / 5500;
            answer[1] = money % 5500;

            return answer;
        }
    }
}