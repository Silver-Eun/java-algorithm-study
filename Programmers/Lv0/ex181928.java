package Lv0;

import java.net.Inet4Address;
import java.util.Scanner;

public class ex181928 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_list = {3, 4, 5, 2, 1};

        ex181928 outer = new ex181928();
        ex181928.Solution sol = outer.new Solution();

        int result = sol.solution(num_list);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;

            String a = "";
            String b = "";

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0)
                    a += String.valueOf(num_list[i]);
                else
                    b += String.valueOf(num_list[i]);
            }

            answer = Integer.parseInt(a) + Integer.parseInt(b);

            return answer;
        }
    }
}