package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex181921 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        ex181921 outer = new ex181921();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(l, r);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    class Solution {
        public int[] solution(int l, int r) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 1; i < 64; i++) {
                int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
                if (l <= num && num <= r) list.add(num);
            }

            if (list.isEmpty()) {
                return new int[]{-1};
            }

            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}