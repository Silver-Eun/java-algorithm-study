package Lv0;

import java.util.Scanner;

public class ex181880 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        ex181880 outer = new ex181880();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;

            for(int i = 0; i < num_list.length; i++) {
                while( 1 < num_list[i]) {
                    if(num_list[i] % 2 ==0)
                        num_list[i]/= 2;
                    else
                        num_list[i] = (num_list[i] - 1)/2;
                    answer++;
                }
            }

            return answer;
        }
    }
}