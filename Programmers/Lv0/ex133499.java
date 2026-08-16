package Lv0;

import java.util.Scanner;

public class ex133499 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        String[] arr = new String[l];

        for (int i = 0; i < l; i++) {
            arr[l] = sc.next();
        }

        ex133499 outer = new ex133499();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;

            String[] words = {"aya", "ye", "woo", "ma"};

            for (String s : babbling) {
                int index = 0;
                String prev = "";
                boolean possible = true;

                while (index < s.length()) {
                    boolean found = false;

                    for (int j = 0; j < words.length; j++) {

                        if (s.startsWith(words[j], index)) {

                            if (prev.equals(words[j])) {
                                possible = false;
                                break;
                            }

                            prev = words[j];
                            index += words[j].length();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        possible = false;
                        break;
                    }
                }

                if (possible)
                    answer++;
            }

            return answer;
        }
    }
}