package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex181920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }

    class Solution {
        public int[] solution(int start_num, int end_num) {
            int[] answer = new int[end_num-start_num+1];

            for(int i = 0; i < answer.length; i++) {
                answer[i] = start_num++;
            }

            return answer;
        }
    }
}