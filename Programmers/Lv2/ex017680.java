package Lv2;

import java.util.LinkedList;
import java.util.Scanner;

public class ex017680 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();
        String[] arr = new String[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.next();
        }

        ex017680 outer = new ex017680();
        Solution sol = outer.new Solution();

        int result = sol.solution(n, arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;

            if (cacheSize == 0) {
                return cities.length * 5;
            }

            LinkedList<String> cache = new LinkedList<>();

            for (int i = 0; i < cities.length; i++) {
                String city = cities[i].toLowerCase();

                if (cache.contains(city)) {
                    answer += 1;
                    cache.remove(city);
                    cache.addLast(city);
                } else {
                    answer += 5;

                    if (cache.size() == cacheSize) {
                        cache.removeFirst();
                    }

                    cache.addLast(city);
                }
            }

            return answer;
        }
    }
}