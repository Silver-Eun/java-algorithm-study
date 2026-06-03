package Lv0;

import java.util.Scanner;

public class ex181870 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }

        ex181870 outer = new ex181870();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(strArr);

        for (String str : result) {
            System.out.print(str + " ");
        }

        sc.close();
    }

    class Solution {
        public String[] solution(String[] strArr) {

            int count = 0;

            for (int i = 0; i < strArr.length; i++) {
                if (!strArr[i].contains("ad")) {
                    count++;
                }
            }

            String[] answer = new String[count];

            int idx = 0;

            for (int i = 0; i < strArr.length; i++) {
                if (!strArr[i].contains("ad")) {
                    answer[idx++] = strArr[i];
                }
            }

            return answer;
        }
    }
}