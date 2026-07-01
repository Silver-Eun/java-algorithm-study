package Lv0;

import java.util.Scanner;

public class ex120880 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
        }

        ex120880 outer = new ex120880();
        Solution sol = outer.new Solution();

        int[] result = sol.solution(arr,n);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int[] solution(int[] numlist, int n) {

            for (int i = 0; i < numlist.length - 1; i++) {
                for (int j = i + 1; j < numlist.length; j++) {

                    int d1 = Math.abs(numlist[i] - n);
                    int d2 = Math.abs(numlist[j] - n);

                    if (d1 > d2 || (d1 == d2 && numlist[i] < numlist[j])) {
                        int temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                    }
                }
            }

            return numlist;
        }
    }
}