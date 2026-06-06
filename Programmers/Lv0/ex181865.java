package Lv0;

import java.util.Scanner;

public class ex181865 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ex181865 outer = new ex181865();
        ex181865.Solution sol = outer.new Solution();

        int result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String binomial) {
            int answer = 0;

            String[] arr = binomial.split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);

            if (arr[1].equals("+"))
                answer = a + b;
            else if (arr[1].equals("-"))
                answer = a - b;
            else if (arr[1].equals("*"))
                answer = a * b;

            return answer;
        }
    }
}