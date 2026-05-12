package Lv0;

import java.util.Scanner;

public class ex181931 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean[] included = {true, false, false, true, true};

        ex181931 outer = new ex181931();
        ex181931.Solution sol = outer.new Solution();

        int result = sol.solution(a, b, included);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int a, int d, boolean[] included) {
            int answer = 0;

            for (int i = 0; i < included.length; i++) {
                if (included[i]) {
                    answer += a + i * d;
                }
            }

            return answer;
        }
    }
}