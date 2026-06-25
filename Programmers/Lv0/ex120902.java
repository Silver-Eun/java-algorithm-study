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
            int answer = 0;

            String[] a = my_string.split(" ");

            int A = Integer.parseInt(a[0]);
            int B = Integer.parseInt(a[2]);

            if (a[1].equals("+"))
                answer = A + B;
            else
                answer = A - B;

            return answer;
        }
    }
}