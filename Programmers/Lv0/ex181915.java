package Lv0;

import java.util.Scanner;

public class ex181915 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        int n = sc.nextInt();

        int[] index_list = new int[n];
        for (int i = 0; i < n; i++) {
            index_list[i] = sc.nextInt();
        }

        ex181915 outer = new ex181915();
        Solution sol = outer.new Solution();

        String result = sol.solution(my_string, index_list);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int[] index_list) {
            String answer = "";

            for (int i = 0; i < index_list.length; i++) {
                answer += my_string.charAt(index_list[i]);
            }

            return answer;
        }
    }
}