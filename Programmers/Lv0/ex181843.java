package Lv0;

import java.util.Scanner;

public class ex181843 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String c = sc.nextLine();

        ex181843 outer = new ex181843();
        Solution sol = outer.new Solution();

        int result = sol.solution(s, c);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String my_string, String target) {
            int answer = 0;

            if (my_string.contains(target))
                answer = 1;

            return answer;
        }
    }
}