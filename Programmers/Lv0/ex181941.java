package Lv0;

import java.util.Scanner;

public class ex181941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        ex181941 outer = new ex181941();
        Solution sol = outer.new Solution();

        String result = sol.solution(arr);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String[] arr) {
            String answer = "";

            for (int i = 0; i < arr.length; i++) {
                answer += arr[i];
            }
            return answer;
        }
    }
}