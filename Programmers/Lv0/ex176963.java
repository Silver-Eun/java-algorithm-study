package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex176963 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] name = new String[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
        }

        int[] yearning = new int[n];

        for (int i = 0; i < n; i++) {
            yearning[i] = sc.nextInt();
        }

        int photoCount = sc.nextInt();

        String[][] photo = new String[photoCount][];

        for (int i = 0; i < photoCount; i++) {
            int peopleCount = sc.nextInt();

            photo[i] = new String[peopleCount];

            for (int j = 0; j < peopleCount; j++) {
                photo[i][j] = sc.next();
            }
        }

        ex176963 outer = new ex176963();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(name, yearning, photo);

        System.out.println(Arrays.toString(result));

        sc.close();
    }

    class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];

            for (int i = 0; i < photo.length; i++) {
                for (int j = 0; j < photo[i].length; j++) {
                    for (int k = 0; k < name.length; k++) {
                        if (photo[i][j].equals(name[k])) {
                            answer[i] += yearning[k];
                        }
                    }
                }
            }

            return answer;
        }
    }
}