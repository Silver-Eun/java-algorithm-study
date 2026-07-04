package Lv0;

import java.util.Scanner;

public class ex120863 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120863 outer = new ex120863();
        Solution sol = outer.new Solution();

        String result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String polynomial) {
            int xSum = 0;
            int numSum = 0;

            String[] arr = polynomial.split(" \\+ ");

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].contains("x")) {

                    if (arr[i].equals("x")) {
                        xSum++;
                    } else {
                        xSum += Integer.parseInt(arr[i].replace("x", ""));
                    }

                } else {
                    numSum += Integer.parseInt(arr[i]);
                }
            }

            if (xSum == 0) {
                return String.valueOf(numSum);
            }

            if (numSum == 0) {
                if (xSum == 1) {
                    return "x";
                }
                return xSum + "x";
            }

            if (xSum == 1) {
                return "x + " + numSum;
            }

            return xSum + "x + " + numSum;
        }
    }
}