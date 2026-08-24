package Lv0;

import java.util.Scanner;

public class ex172928 {

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

        ex172928 outer = new ex172928();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String[] park, String[] routes) {
            int row = 0;
            int col = 0;

            for (int i = 0; i < park.length; i++) {
                for (int j = 0; j < park[i].length(); j++) {
                    if (park[i].charAt(j) == 'S') {
                        row = i;
                        col = j;
                    }
                }
            }

            for (int i = 0; i < routes.length; i++) {
                String[] route = routes[i].split(" ");

                String direction = route[0];
                int distance = Integer.parseInt(route[1]);

                int dr = 0;
                int dc = 0;

                if (direction.equals("N")) {
                    dr = -1;
                } else if (direction.equals("S")) {
                    dr = 1;
                } else if (direction.equals("W")) {
                    dc = -1;
                } else if (direction.equals("E")) {
                    dc = 1;
                }

                int newRow = row;
                int newCol = col;
                boolean possible = true;

                for (int j = 0; j < distance; j++) {
                    newRow += dr;
                    newCol += dc;

                    if (newRow < 0 || newRow >= park.length ||
                            newCol < 0 || newCol >= park[0].length()) {
                        possible = false;
                        break;
                    }

                    if (park[newRow].charAt(newCol) == 'X') {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    row = newRow;
                    col = newCol;
                }
            }

            return new int[]{row, col};
        }
    }
}