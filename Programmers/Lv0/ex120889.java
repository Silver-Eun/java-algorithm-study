package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120889 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex120889 outer = new ex120889();
        ex120889.Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] sides) {
            int answer = 0;

            Arrays.sort(sides);

            if(sides[2] < sides[0] + sides[1])
                answer = 1;
            else
                answer = 2;

            return answer;
        }
    }
}