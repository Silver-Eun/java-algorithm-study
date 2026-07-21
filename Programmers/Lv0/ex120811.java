package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120811 outer = new ex120811();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] array) {
            Arrays.sort(array);

            int answer = array[array.length / 2];

            return answer;
        }
    }
}