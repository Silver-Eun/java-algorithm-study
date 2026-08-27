package Lv0;

import java.util.Scanner;

public class ex340213 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        ex340213 outer = new ex340213();
        Solution sol = outer.new Solution();

        String result = sol.solution(a, b, c, d, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            String answer = "";

            String[] a = video_len.split(":");
            String[] b = pos.split(":");
            String[] c = op_start.split(":");
            String[] d = op_end.split(":");

            int video = Integer.valueOf(a[0]) * 60 + Integer.valueOf(a[1]);
            int current = Integer.valueOf(b[0]) * 60 + Integer.valueOf(b[1]);
            int start = Integer.valueOf(c[0]) * 60 + Integer.valueOf(c[1]);
            int end = Integer.valueOf(d[0]) * 60 + Integer.valueOf(d[1]);

            int time = current;

            if (start <= time && time <= end)
                time = end;

            for (int i = 0; i < commands.length; i++) {
                if (commands[i].equals("next")) {
                    time += 10;
                    if (video - 10 < time)
                        time = video;
                } else if (commands[i].equals("prev")) {
                    time -= 10;
                    if (time < 10)
                        time = 0;
                }

                if (start <= time && time <= end)
                    time = end;
            }

            if (time < 600)
                answer += "0" + String.valueOf(time / 60);
            else
                answer += String.valueOf(time / 60);

            answer += ":";

            if (time % 60 < 10)
                answer += "0" + String.valueOf(time % 60);
            else
                answer += String.valueOf(time % 60);


            return answer;
        }
    }
}