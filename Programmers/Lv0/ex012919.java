package Lv0;

import java.util.Scanner;

public class ex012919 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        ex012919 outer = new ex012919();
        Solution sol = outer.new Solution();

        String result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String[] seoul) {
            String answer = "";

            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    answer = "김서방은 " + i + "에 있다";
                    break;
                }
            }

            return answer;
        }
    }
}