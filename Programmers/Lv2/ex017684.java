package Lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ex017684 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ex017684 outer = new ex017684();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(s);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(String msg) {
            HashMap<String, Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < 26; i++) {
                map.put(String.valueOf((char) ('A' + i)), i + 1);
            }

            int index = 0;
            int number = 27;

            while (index < msg.length()) {
                String w = String.valueOf(msg.charAt(index));

                while (index + 1 < msg.length()) {
                    String next = w + msg.charAt(index + 1);

                    if (!map.containsKey(next)) {
                        map.put(next, number++);
                        break;
                    }

                    w = next;
                    index++;
                }

                list.add(map.get(w));
                index++;
            }

            int[] answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}