package Lv2;

import java.util.HashSet;
import java.util.Scanner;

public class ex049994 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex049994 outer = new ex049994();
        Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String dirs) {
            int answer = 0;
            int x = 0;
            int y = 0;

            HashSet<String> set = new HashSet<>();

            for (char dir : dirs.toCharArray()) {
                int nx = x;
                int ny = y;

                if (dir == 'U') ny++;
                else if (dir == 'D') ny--;
                else if (dir == 'R') nx++;
                else if (dir == 'L') nx--;

                if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                    continue;
                }

                String road1 = x + "," + y + "-" + nx + "," + ny;
                String road2 = nx + "," + ny + "-" + x + "," + y;

                if (!set.contains(road1)) {
                    answer++;
                    set.add(road1);
                    set.add(road2);
                }

                x = nx;
                y = ny;
            }

            return answer;
        }
    }
}