package Lv0;

import java.util.Scanner;

public class ex181929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_list = {3, 4, 5, 2, 1};

        ex181929 outer = new ex181929();
        ex181929.Solution sol = outer.new Solution();

        int result = sol.solution(num_list);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;

            int sum = 0;
            int div = 1;

            for(int i = 0; i < num_list.length; i++) {
                sum += num_list[i];
                div *= num_list[i];
            }

            answer = div < sum*sum ? 1 : 0;

            return answer;
        }
    }
}