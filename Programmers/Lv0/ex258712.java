package Lv0;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex258712 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr1 = new String[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }

        int m = sc.nextInt();
        String[] arr2 = new String[n];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.next();
        }

        ex258712 outer = new ex258712();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String[] friends, String[] gifts) {
            int n = friends.length;
            int[] answer = new int[n];
            int[] give = new int[n];
            int[] receive = new int[n];
            int[][] count = new int[n][n];

            Map<String, Integer> index = new HashMap<>();

            for (int i = 0; i < n; i++) {
                index.put(friends[i], i);
            }

            for (String gift : gifts) {
                String[] split = gift.split(" ");

                int from = index.get(split[0]);
                int to = index.get(split[1]);

                count[from][to]++;
                give[from]++;
                receive[to]++;
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (count[i][j] > count[j][i]) {
                        answer[i]++;
                    } else if (count[i][j] < count[j][i]) {
                        answer[j]++;
                    } else {
                        int scoreI = give[i] - receive[i];
                        int scoreJ = give[j] - receive[j];

                        if (scoreI > scoreJ) {
                            answer[i]++;
                        } else if (scoreI < scoreJ) {
                            answer[j]++;
                        }
                    }
                }
            }

            int max = 0;

            for (int i = 0; i < n; i++) {
                max = Math.max(max, answer[i]);
            }

            return max;
        }
    }
}