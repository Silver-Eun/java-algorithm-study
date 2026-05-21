package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex181908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }

    class Solution {
        public int solution(String my_string, String is_suffix) {
            int answer = 0;

            if (my_string.endsWith(is_suffix))
                answer = 1;

            return answer;
        }
    }
}