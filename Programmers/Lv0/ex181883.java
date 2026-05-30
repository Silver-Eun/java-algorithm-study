package Lv0;

import java.util.Scanner;

public class ex181883 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.close();
    }

    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = {};

            for (int i = 0; i < queries.length; i++) {

                for (int j = 0; j < arr.length; j++) {
                    if (queries[i][0] <= j && j <= queries[i][1])
                        arr[j]++;
                }
            }

            answer = arr;

            return answer;
        }
    }
}