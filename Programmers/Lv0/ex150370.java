package Lv0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex150370 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = sc.nextInt();
        String[] arr1 = new String[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }

        int m = sc.nextInt();
        String[] arr2 = new String[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.next();
        }

        ex150370 outer = new ex150370();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(s, arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            Map<String, Integer> termMap = new HashMap<>();

            for (String term : terms) {
                String[] split = term.split(" ");
                termMap.put(split[0], Integer.parseInt(split[1]));
            }

            int todayDay = convert(today);

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < privacies.length; i++) {
                String[] split = privacies[i].split(" ");

                String date = split[0];
                String type = split[1];

                int privacyDay = convert(date);
                int expireDay = privacyDay + termMap.get(type) * 28;

                if (expireDay <= todayDay) {
                    list.add(i + 1);
                }
            }

            int[] answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }

        public int convert(String date) {
            String[] split = date.split("\\.");

            int year = Integer.parseInt(split[0]);
            int month = Integer.parseInt(split[1]);
            int day = Integer.parseInt(split[2]);

            return year * 12 * 28 + month * 28 + day;
        }
    }
}