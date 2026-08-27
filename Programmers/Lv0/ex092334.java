package Lv0;

import java.util.*;

public class ex092334 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int m = sc.nextInt();
        String[] arr1 = new String[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.next();
        }

        int k = sc.nextInt();

        ex092334 outer = new ex092334();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr, arr1, k);
        System.out.println(result);

        sc.close();
    }


    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];

            Map<String, Integer> index = new HashMap<>();

            for (int i = 0; i < id_list.length; i++) {
                index.put(id_list[i], i);
            }

            Set<String> reportSet = new HashSet<>(Arrays.asList(report));

            int[] reportCount = new int[id_list.length];

            for (String r : reportSet) {
                String[] users = r.split(" ");

                String reported = users[1];

                reportCount[index.get(reported)]++;
            }

            for (String r : reportSet) {
                String[] users = r.split(" ");

                String reporter = users[0];
                String reported = users[1];

                if (reportCount[index.get(reported)] >= k) {
                    answer[index.get(reporter)]++;
                }
            }

            return answer;
        }
    }
}