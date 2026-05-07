package Lv0;

import java.util.Scanner;

public class ex181940 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        int k = sc.nextInt();

        ex181940 outer = new ex181940();
        Solution sol = outer.new Solution();

        String result = sol.solution(my_string, k);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int k) {
            String answer = "";

            for (int i = 0; i < k; i++) {
                answer += my_string;
            }

            return answer;
        }
    }
}