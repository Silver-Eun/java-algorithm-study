package Lv0;

import java.util.Scanner;

public class ex181855 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }

        ex181855 outer = new ex181855();
        Solution sol = outer.new Solution();

        int result = sol.solution(strArr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String[] strArr) {
            int answer = 0;

            int[] arr = new int[30];

            for (int i = 0; i < strArr.length; i++) {
                arr[strArr[i].length() - 1]++;
            }

            for (int i = 0; i < arr.length; i++) {
                if (answer < arr[i])
                    answer = arr[i];
            }

            return answer;
        }
    }
}