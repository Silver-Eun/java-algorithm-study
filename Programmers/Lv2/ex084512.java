package Lv2;

import java.util.Scanner;

public class ex084512 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex084512 outer = new ex084512();
        Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String word) {
            int answer = 0;

            int[] weight = {781, 156, 31, 6, 1};

            for (int i = 0; i < word.length(); i++) {
                switch (word.charAt(i)) {
                    case 'A':
                        answer += 1;
                        break;
                    case 'E':
                        answer += 1 + 1 * weight[i];
                        break;
                    case 'I':
                        answer += 1 + 2 * weight[i];
                        break;
                    case 'O':
                        answer += 1 + 3 * weight[i];
                        break;
                    case 'U':
                        answer += 1 + 4 * weight[i];
                        break;
                }
            }

            return answer;
        }
    }
}