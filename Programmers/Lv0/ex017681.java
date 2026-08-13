package Lv0;

import java.util.Scanner;

public class ex017681 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }


        ex017681 outer = new ex017681();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(n, arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            for (int i = 0; i < n; i++) {
                answer[i] = "";

                String a = Integer.toBinaryString(arr1[i]);
                String b = Integer.toBinaryString(arr2[i]);

                while (a.length() < n) {
                    a = "0" + a;
                }
                while (b.length() < n) {
                    b = "0" + b;
                }

                for (int j = 0; j < n; j++) {
                    if (a.charAt(j) == '1' || b.charAt(j) == '1')
                        answer[i] += "#";
                    else
                        answer[i] += " ";
                }
            }

            return answer;
        }
    }
}