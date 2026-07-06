package Lv0;

import java.net.Inet4Address;
import java.util.Scanner;

public class ex120853 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120853 outer = new ex120853();
        Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String s) {
            int answer = 0;

            String[] a = s.split(" ");

            for(int i = 0; i < a.length; i++) {
                if(a[i].equals("Z"))
                    answer -= Integer.parseInt(a[i-1]);
                else
                    answer += Integer.parseInt(a[i]);
            }

            return answer;
        }
    }
}