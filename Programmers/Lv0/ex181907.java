package Lv0;

import java.util.Scanner;

public class ex181907 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }

    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            answer = my_string.substring(0, n);

            return answer;
        }
    }
}