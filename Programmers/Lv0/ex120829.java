package Lv0;

import java.util.Scanner;

public class ex120829 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120829 outer = new ex120829();
        Solution sol = outer.new Solution();

        int result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int angle) {
            int answer = 0;

            if (angle < 90)
                answer = 1;
            else if (angle == 90)
                answer = 2;
            else if (90 < angle && angle < 180)
                answer = 3;
            else if (angle == 180)
                answer = 4;

            return answer;
        }
    }
}