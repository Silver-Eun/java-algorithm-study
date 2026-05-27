package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex181890 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] str_list = new String[n];

        for (int i = 0; i < n; i++) {
            str_list[i] = sc.next();
        }

        ex181890 outer = new ex181890();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(str_list);

        for (String str : result) {
            System.out.print(str + " ");
        }

        sc.close();
    }

    class Solution {
        public String[] solution(String[] str_list) {

            String[] answer = {};

            String a = "";
            int b = 0;

            for (int i = 0; i < str_list.length; i++) {

                if (str_list[i].equals("l") || str_list[i].equals("r")) {
                    a = str_list[i];
                    b = i;
                    break;
                }
            }

            if (a.equals("l"))
                answer = Arrays.copyOfRange(str_list, 0, b);

            else if (a.equals("r"))
                answer = Arrays.copyOfRange(str_list, b + 1, str_list.length);

            return answer;
        }
    }
}