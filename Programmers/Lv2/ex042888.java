package Lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ex042888 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr1 = new String[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }

        ex042888 outer = new ex042888();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(arr1);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String[] solution(String[] record) {
            HashMap<String, String> map = new HashMap<>();
            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < record.length; i++) {
                String[] arr = record[i].split(" ");

                if (arr[0].equals("Enter") || arr[0].equals("Change")) {
                    map.put(arr[1], arr[2]);
                }
            }

            for (int i = 0; i < record.length; i++) {
                String[] arr = record[i].split(" ");

                if (arr[0].equals("Enter")) {
                    list.add(map.get(arr[1]) + "님이 들어왔습니다.");
                } else if (arr[0].equals("Leave")) {
                    list.add(map.get(arr[1]) + "님이 나갔습니다.");
                }
            }

            return list.toArray(new String[0]);
        }
    }
}