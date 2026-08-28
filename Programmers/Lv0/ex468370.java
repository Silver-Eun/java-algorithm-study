package Lv0;

import java.util.*;

public class ex468370 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ex468370 outer = new ex468370();
        Solution sol = outer.new Solution();

        int result = sol.solution(s, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String message, int[][] spoiler_ranges) {
            int n = message.length();
            int m = spoiler_ranges.length;

            int[] rangeOf = new int[n];
            Arrays.fill(rangeOf, -1);

            for (int i = 0; i < m; i++) {
                for (int j = spoiler_ranges[i][0]; j <= spoiler_ranges[i][1]; j++) {
                    rangeOf[j] = i;
                }
            }

            Set<String> normalWords = new HashSet<>();
            Set<String> openedWords = new HashSet<>();

            List<List<String>> reveal = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                reveal.add(new ArrayList<>());
            }

            int i = 0;

            while (i < n) {
                int start = i;

                while (i < n && message.charAt(i) != ' ') {
                    i++;
                }

                int end = i - 1;
                String word = message.substring(start, i);

                int lastRange = -1;
                boolean spoiler = false;

                for (int j = start; j <= end; j++) {
                    if (rangeOf[j] != -1) {
                        spoiler = true;
                        lastRange = rangeOf[j];
                    }
                }

                if (!spoiler) {
                    normalWords.add(word);
                } else {
                    reveal.get(lastRange).add(word);
                }

                i++;
            }

            int answer = 0;

            for (int r = 0; r < m; r++) {
                for (String word : reveal.get(r)) {
                    if (!normalWords.contains(word) && !openedWords.contains(word)) {
                        answer++;
                    }

                    openedWords.add(word);
                }
            }

            return answer;
        }
    }
}