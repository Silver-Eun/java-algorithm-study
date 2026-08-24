package Lv0;

import java.util.Scanner;

public class ex340198 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matsLength = sc.nextInt();
        int[] mats = new int[matsLength];

        for (int i = 0; i < matsLength; i++) {
            mats[i] = sc.nextInt();
        }

        int row = sc.nextInt();
        int col = sc.nextInt();

        String[][] park = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                park[i][j] = sc.next();
            }
        }

        ex340198 outer = new ex340198();
        Solution sol = outer.new Solution();

        int result = sol.solution(mats, park);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] mats, String[][] park) {
            int answer = -1;

            for (int i = 0; i < mats.length; i++) {
                int size = mats[i];

                for (int j = 0; j <= park.length - size; j++) {
                    for (int k = 0; k <= park[0].length - size; k++) {

                        boolean possible = true;

                        for (int a = j; a < j + size; a++) {
                            for (int b = k; b < k + size; b++) {
                                if (!park[a][b].equals("-1")) {
                                    possible = false;
                                    break;
                                }
                            }

                            if (!possible) {
                                break;
                            }
                        }

                        if (possible) {
                            answer = Math.max(answer, size);
                        }
                    }
                }
            }

            return answer;
        }
    }
}