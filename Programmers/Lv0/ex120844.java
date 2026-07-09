package Lv0;

import java.util.Scanner;

public class ex120844 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] box = new int[n];

        for (int i = 0; i < box.length; i++) {
            box[i] = sc.nextInt();
        }

        String s = sc.next();

        ex120844 outer = new ex120844();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(box, s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] numbers, String direction) {
            int[] answer = new int[numbers.length];

            if (direction.equals("right")) {
                answer[0] = numbers[numbers.length - 1];

                for (int i = 1; i < numbers.length; i++) {
                    answer[i] = numbers[i - 1];
                }
            } else {
                answer[numbers.length - 1] = numbers[0];

                for (int i = 0; i < numbers.length - 1; i++) {
                    answer[i] = numbers[i + 1];
                }
            }

            return answer;
        }
    }
}