package Lv0;

import java.util.Scanner;

public class ex120902 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120902 outer = new ex120902();
        Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String my_string) {

            String[] arr = my_string.split(" ");

            int answer = Integer.parseInt(arr[0]);

            for (int i = 1; i < arr.length; i += 2) {

                if (arr[i].equals("+")) {
                    answer += Integer.parseInt(arr[i + 1]);
                } else {
                    answer -= Integer.parseInt(arr[i + 1]);
                }
            }

            return answer;
        }
    }
}