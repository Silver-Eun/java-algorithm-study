package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex181862 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ex181862 outer = new ex181862();
        ex181862.Solution sol = outer.new Solution();

        String[] result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }


    class Solution {
        public String[] solution(String myStr) {

            String[] temp = myStr.split("[abc]");

            ArrayList<String> list = new ArrayList<>();

            for (String s : temp) {
                if (!s.equals("")) {
                    list.add(s);
                }
            }

            if (list.size() == 0) {
                return new String[]{"EMPTY"};
            }

            return list.toArray(new String[0]);
        }
    }
}