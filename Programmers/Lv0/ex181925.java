package Lv0;

import java.util.Scanner;

public class ex181925 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        ex181925 outer = new ex181925();
        ex181925.Solution sol = outer.new Solution();

        String result = sol.solution(numLog);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(int[] numLog) {
            String answer = "";

            for (int i = 1; i < numLog.length; i++) {
                if ((numLog[i] - numLog[i-1]) == 1)
                    answer += "w";
                else if ((numLog[i] - numLog[i-1]) == -1)
                    answer += "s";
                else if ((numLog[i] - numLog[i-1]) == 10)
                    answer += "d";
                else if ((numLog[i] - numLog[i-1]) == -10)
                    answer += "a";
            }

            return answer;
        }
    }
}