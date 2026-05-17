package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex181919 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ex181919 outer = new ex181919();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int n) {
            ArrayList<Integer> list = new ArrayList<>();

            while (1 <= n) {
                list.add(n);

                if (n % 2 == 0) n /= 2;
                else n = 3 * n + 1;
            }

            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}