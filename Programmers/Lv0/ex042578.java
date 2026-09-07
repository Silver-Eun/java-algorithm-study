package Lv0;

import java.util.HashMap;
import java.util.Scanner;

public class ex042578 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] arr = new String[2][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[j][i] = sc.next();
            }
        }

        ex042578 outer = new ex042578();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;

            HashMap<String, Integer> cloth = new HashMap<>();

            for (int i = 0; i < clothes.length; i++) {
                cloth.put(clothes[i][1], cloth.getOrDefault(clothes[i][1], 0) + 1);
            }
            for (int count : cloth.values()) {
                answer *= count + 1;
            }

            return answer - 1;
        }
    }
}