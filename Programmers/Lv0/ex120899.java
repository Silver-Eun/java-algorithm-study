package Lv0;

import java.util.Scanner;

public class ex120899 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.close();
    }

    class Solution {
        public int[] solution(int[] array) {
            int[] answer = new int[2];

            int max = 0;

            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                    answer[0] = array[i];
                    answer[1] = i;
                }
            }

            return answer;
        }
    }
}