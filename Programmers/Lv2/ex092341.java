package Lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ex092341 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        String[] arr2 = new String[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.next();
        }

        ex092341 outer = new ex092341();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] fees, String[] records) {
            HashMap<String, Integer> in = new HashMap<>();
            HashMap<String, Integer> total = new HashMap<>();

            for (int i = 0; i < records.length; i++) {
                String[] arr = records[i].split(" ");

                String[] time = arr[0].split(":");

                int hour = Integer.parseInt(time[0]);
                int minute = Integer.parseInt(time[1]);

                int totalTime = hour * 60 + minute;

                if (arr[2].equals("IN")) {
                    in.put(arr[1], totalTime);
                } else {
                    int parkingTime = totalTime - in.get(arr[1]);
                    total.put(arr[1], total.getOrDefault(arr[1], 0) + parkingTime);
                    in.remove(arr[1]);
                }
            }

            for (String car : in.keySet()) {
                int parkingTime = 1439 - in.get(car);

                total.put(car, total.getOrDefault(car, 0) + parkingTime);
            }

            ArrayList<String> cars = new ArrayList<>(total.keySet());
            Collections.sort(cars);

            int[] answer = new int[cars.size()];

            for (int i = 0; i < cars.size(); i++) {
                String car = cars.get(i);

                int time = total.get(car);
                int fee = fees[1];

                if (time > fees[0]) {
                    int extra = time - fees[0];
                    int unit = (extra + fees[2] - 1) / fees[2];

                    fee += unit * fees[3];
                }

                answer[i] = fee;
            }

            return answer;
        }
    }
}
