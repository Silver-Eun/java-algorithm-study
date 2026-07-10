package Lv0;

import java.util.Scanner;

public class ex120841 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] box = new int[2];

        for (int i = 0; i < box.length; i++) {
            box[i] = sc.nextInt();
        }

        ex120841 outer = new ex120841();
        Solution sol = outer.new Solution();

        int result = sol.solution(box);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] dot) {
            int answer = 0;

            if( 0 < dot[0]) {
                if( 0 < dot[1])
                    answer = 1;
                else
                    answer = 4;
            } else {
                if( 0 > dot[1])
                    answer = 3;
                else
                    answer = 2;
            }

            return answer;
        }
    }
}