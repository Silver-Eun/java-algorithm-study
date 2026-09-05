package Lv0;

import java.util.HashSet;
import java.util.Scanner;

public class ex131701 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ex131701 outer = new ex131701();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] elements) {
            int answer = 0;

            HashSet<Integer> arr = new HashSet<>();

            for (int len = 1; len <= elements.length; len++) {
                for (int i = 0; i < elements.length; i++) {
                    int sum = 0;

                    for (int j = 0; j < len; j++) {
                        sum += elements[(i + j) % elements.length];
                    }

                    arr.add(sum);
                }
            }

            answer = arr.size();

            return answer;
        }
    }
}