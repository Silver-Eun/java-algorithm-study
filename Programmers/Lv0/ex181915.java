package Lv0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex181915 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.close();
    }

    class Solution {
        public String solution(String my_string, int[] index_list) {
            String answer = "";

            for(int i = 0; i < index_list.length; i++) {
                answer += my_string.charAt(index_list[i]);
            }

            return answer;
        }
    }
}