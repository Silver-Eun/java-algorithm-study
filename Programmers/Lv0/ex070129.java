package Lv0;

import java.util.Scanner;

public class ex070129 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex070129 outer = new ex070129();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String s) {
            int cnt = 0;
            int cnt0 = 0;

            while (!s.equals("1")) {
                int cnt1 = 0;

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '1')
                        cnt1++;
                }

                cnt0 += s.length() - cnt1;
                s = Integer.toBinaryString(cnt1);
                cnt++;
            }

            int[] answer = {cnt, cnt0};
            return answer;
        }
    }
}