package Lv0;

import java.util.Scanner;

public class ex181887 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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