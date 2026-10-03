package Lv2;

import java.util.Scanner;

public class ex049993 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        ex049993 outer = new ex049993();
        Solution sol = outer.new Solution();

        int result = sol.solution(s, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;

            for (int i = 0; i < skill_trees.length; i++) {
                String s = "";

                for (int j = 0; j < skill_trees[i].length(); j++) {
                    if (skill.indexOf(skill_trees[i].charAt(j)) != -1) {
                        s += skill_trees[i].charAt(j);
                    }
                }

                if (skill.startsWith(s))
                    answer++;
            }

            return answer;
        }
    }
}