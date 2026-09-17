package Lv0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ex064065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex064065 outer = new ex064065();
        ex064065.Solution sol = outer.new Solution();

        int[] result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String s) {
            String[] sets = s.substring(2, s.length() - 2).split("\\},\\{");

            Arrays.sort(sets, (a, b) -> a.length() - b.length());

            int[] answer = new int[sets.length];
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < sets.length; i++) {
                String[] nums = sets[i].split(",");

                for (String num : nums) {
                    int n = Integer.parseInt(num);

                    if (set.add(n)) {
                        answer[i] = n;
                        break;
                    }
                }
            }

            return answer;
        }
    }
}