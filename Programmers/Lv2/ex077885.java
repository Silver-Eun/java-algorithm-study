package Lv2;

import java.util.Scanner;

public class ex077885 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        ex077885 outer = new ex077885();
        Solution sol = outer.new Solution();

        long[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public long[] solution(long[] numbers) {
            long[] answer = new long[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                char[] arr = Long.toBinaryString(numbers[i]).toCharArray();

                if (arr[arr.length - 1] == '0')
                    answer[i] = numbers[i] + 1;
                else {
                    boolean allOne = true;

                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == '0') {
                            allOne = false;
                            break;
                        }

                    }

                    if (allOne) {
                        arr = ('0' + Long.toBinaryString(numbers[i])).toCharArray();
                    }

                    for (int j = arr.length - 1; j >= 0; j--) {
                        if (arr[j] == '0') {
                            arr[j] = '1';
                            arr[j + 1] = '0';
                            break;
                        }
                    }
                    answer[i] = Long.parseLong(new String(arr), 2);
                }
            }

            return answer;
        }
    }
}