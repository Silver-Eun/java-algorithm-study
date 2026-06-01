package Lv0;

import java.util.Scanner;

public class ex181875 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }

        ex181875 outer = new ex181875();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(strArr);

        for (String str : result) {
            System.out.print(str + " ");
        }

        sc.close();
    }

    class Solution {
        public String[] solution(String[] strArr) {
            String[] answer = new String[strArr.length];

            for (int i = 0; i < strArr.length; i++) {
                if (i % 2 == 0)
                    answer[i] = strArr[i].toLowerCase();
                else
                    answer[i] = strArr[i].toUpperCase();
            }


            return answer;
        }
    }
}