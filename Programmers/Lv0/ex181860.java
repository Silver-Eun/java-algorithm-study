package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex181860 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, boolean[] flag) {

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {

                if (flag[i]) {

                    for (int j = 0; j < arr[i] * 2; j++) {
                        list.add(arr[i]);
                    }

                } else {

                    for (int j = 0; j < arr[i]; j++) {
                        list.remove(list.size() - 1);
                    }

                }
            }

            int[] answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}