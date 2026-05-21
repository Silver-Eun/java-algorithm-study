package Lv0;

import java.util.Scanner;

public class ex181906 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }

    class Solution {
        public int solution(String my_string, String is_prefix) {
            int answer = 0;

            if(my_string.startsWith(is_prefix))
                answer = 1;

            return answer;
        }
    }
}