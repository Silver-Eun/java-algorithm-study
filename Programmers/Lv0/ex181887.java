package Lv0;

import java.util.Scanner;

public class ex181887 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] num_list = new int[len];

        for (int i = 0; i < len; i++) {
            num_list[i] = sc.nextInt();
        }

        ex181887 outer = new ex181887();
        Solution sol = outer.new Solution();

        int result = sol.solution(num_list);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;

            int a = 0;
            int b = 0;

            for (int i = 0; i < num_list.length; i++) {
                if ((i + 1) % 2 == 1)
                    a += num_list[i];
                else
                    b += num_list[i];
            }

            answer = a > b ? a : b;


            return answer;
        }
    }
}