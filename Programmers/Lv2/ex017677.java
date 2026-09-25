package Lv2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex017677 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        ex017677 outer = new ex017677();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, b);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String str1, String str2) {
            HashMap<String, Integer> map1 = new HashMap<>();
            HashMap<String, Integer> map2 = new HashMap<>();

            for (int i = 0; i < str1.length() - 1; i++) {
                String s = str1.substring(i, i + 2).toLowerCase();

                if (Character.isLetter(s.charAt(0)) && Character.isLetter(s.charAt(1))) {
                    map1.put(s, map1.getOrDefault(s, 0) + 1);
                }
            }

            for (int i = 0; i < str2.length() - 1; i++) {
                String s = str2.substring(i, i + 2).toLowerCase();

                if (Character.isLetter(s.charAt(0)) && Character.isLetter(s.charAt(1))) {
                    map2.put(s, map2.getOrDefault(s, 0) + 1);
                }
            }

            int intersection = 0;
            int union = 0;

            for (Map.Entry<String, Integer> entry : map1.entrySet()) {
                String key = entry.getKey();

                int count1 = map1.get(key);
                int count2 = map2.getOrDefault(key, 0);

                intersection += Math.min(count1, count2);
            }

            int total1 = 0;
            int total2 = 0;

            for (int count : map1.values()) {
                total1 += count;
            }

            for (int count : map2.values()) {
                total2 += count;
            }

            union = total1 + total2 - intersection;

            if (union == 0) {
                return 65536;
            }

            return (int)((double) intersection / union * 65536);
        }
    }
}