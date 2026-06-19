package Lv0;

import java.util.Scanner;

public class ex120956 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i] = sc.next();
            }
        }

        ex120956 outer = new ex120956();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;

            for (String s : babbling) {
                if (s.matches("^(aya|ye|woo|ma)+$")
                        && !s.contains("ayaaya")
                        && !s.contains("yeye")
                        && !s.contains("woowoo")
                        && !s.contains("mama")) {
                    answer++;
                }
            }

            return answer;
        }
    }
}