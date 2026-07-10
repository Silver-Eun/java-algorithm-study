package Lv0;

import java.math.BigInteger;
import java.util.Scanner;

public class ex120839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120839 outer = new ex120839();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String rsp) {
            String answer = "";

            for(int i = 0; i < rsp.length(); i++) {
                if(rsp.charAt(i) == '2')
                    answer += '0';
                else if(rsp.charAt(i) == '0')
                    answer += '5';
                else if(rsp.charAt(i) == '5')
                    answer += '2';
            }

            return answer;
        }
    }
}