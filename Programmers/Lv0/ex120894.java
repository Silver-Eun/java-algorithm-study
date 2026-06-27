package Lv0;

import java.util.Scanner;

public class ex120894 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex120894 outer = new ex120894();
        ex120894.Solution sol = outer.new Solution();

        long result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public long solution(String numbers) {
            long answer = 0;

            numbers = numbers.replace("zero", "0");
            numbers = numbers.replace("one", "1");
            numbers = numbers.replace("two", "2");
            numbers = numbers.replace("three", "3");
            numbers = numbers.replace("four", "4");
            numbers = numbers.replace("five", "5");
            numbers = numbers.replace("six", "6");
            numbers = numbers.replace("seven", "7");
            numbers = numbers.replace("eight", "8");
            numbers = numbers.replace("nine", "9");

            answer = Long.parseLong(numbers);

            return answer;
        }
    }
}