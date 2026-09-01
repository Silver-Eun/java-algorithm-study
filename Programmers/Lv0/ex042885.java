package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex042885 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        ex042885 outer = new ex042885();
        Solution sol = outer.new Solution();

        int result = sol.solution(a, n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;

            Arrays.sort(people);

            int left = 0;
            int right = people.length - 1;

            while (left <= right) {
                if (people[left] + people[right] <= limit) {
                    left++;
                    right--;
                } else {
                    right--;
                }

                answer++;
            }

            return answer;
        }
    }
}