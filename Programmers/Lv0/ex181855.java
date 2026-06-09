package Lv0;

import java.util.Scanner;

public class ex181855 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.close();
    }

    class Solution {
        public int solution(String[] strArr) {
            int answer = 0;

            int[] arr = new int[30];

            for(int i = 0; i < strArr.length; i++) {
                arr[strArr[i].length()-1]++;
            }

            for(int i = 0; i < arr.length; i++) {
                if(answer < arr[i])
                    answer = arr[i];
            }

            return answer;
        }
    }
}