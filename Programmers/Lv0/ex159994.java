package Lv0;

import java.util.Scanner;

public class ex159994 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String[] cards1 = new String[n1];

        for (int i = 0; i < n1; i++) {
            cards1[i] = sc.next();
        }

        int n2 = sc.nextInt();
        String[] cards2 = new String[n2];

        for (int i = 0; i < n2; i++) {
            cards2[i] = sc.next();
        }

        int n3 = sc.nextInt();
        String[] goal = new String[n3];

        for (int i = 0; i < n3; i++) {
            goal[i] = sc.next();
        }

        ex159994 outer = new ex159994();
        Solution sol = outer.new Solution();

        String result = sol.solution(cards1, cards2, goal);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            int index1 = 0;
            int index2 = 0;

            for (int i = 0; i < goal.length; i++) {

                if (index1 < cards1.length &&
                        cards1[index1].equals(goal[i])) {

                    index1++;

                } else if (index2 < cards2.length &&
                        cards2[index2].equals(goal[i])) {

                    index2++;

                } else {
                    return "No";
                }
            }

            return "Yes";
        }
    }
}