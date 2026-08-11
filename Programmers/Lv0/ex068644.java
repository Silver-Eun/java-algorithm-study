package Lv0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ex068644 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ex068644 outer = new ex068644();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] numbers) {
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++)
                    set.add(numbers[i] + numbers[j]);
            }

            int[] answer = new int[set.size()];

            int index = 0;

            for (int num : set) {
                answer[index++] = num;
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}