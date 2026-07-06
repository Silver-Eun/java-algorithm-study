package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex120852 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex120852 outer = new ex120852();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int n) {

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 2; i <= n; i++) {

                if (n % i == 0) {

                    list.add(i);

                    while (n % i == 0) {
                        n /= i;
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