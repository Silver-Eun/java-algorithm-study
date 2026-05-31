package Lv0;

import java.util.Scanner;

public class ex181879 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        ex181879 outer = new ex181879();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;

            if( 11 <= num_list.length) {
                for(int i = 0; i < num_list.length; i++) {
                    answer += num_list[i];
                }
            } else {
                answer = 1;
                for(int i = 0; i < num_list.length; i++) {
                    answer *= num_list[i];
                }
            }

            return answer;
        }
    }
}