package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex181866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ex181866 outer = new ex181866();
        ex181866.Solution sol = outer.new Solution();

        String[] result = sol.solution(s);

        for (String str : result) {
            System.out.print(str + " ");
        }

        sc.close();
    }

    class Solution {
        public String[] solution(String myString) {

            String[] temp = myString.split("x");

            ArrayList<String> list = new ArrayList<>();

            for (String s : temp) {
                if (!s.equals("")) {
                    list.add(s);
                }
            }

            String[] answer = list.toArray(new String[0]);

            Arrays.sort(answer);

            return answer;
        }
    }
}