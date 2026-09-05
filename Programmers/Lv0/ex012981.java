package Lv0;

import java.util.HashSet;
import java.util.Scanner;

public class ex012981 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();
        String[] arr = new String[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.next();
        }

        ex012981 outer = new ex012981();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(n, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];

            HashSet<String> set = new HashSet<>();

            set.add(words[0]);

            for (int i = 1; i < words.length; i++) {
                if (set.contains(words[i]) ||
                        words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {

                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    break;
                }

                set.add(words[i]);
            }

            return answer;
        }
    }
}