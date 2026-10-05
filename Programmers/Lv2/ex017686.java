package Lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ex017686 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            String s = sc.next();
        }

        ex017686 outer = new ex017686();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }


    class Solution {
        public String[] solution(String[] files) {
            Arrays.sort(files, new Comparator<String>() {
                public int compare(String a, String b) {
                    int aIndex = 0;
                    int bIndex = 0;

                    while (!Character.isDigit(a.charAt(aIndex))) {
                        aIndex++;
                    }

                    while (!Character.isDigit(b.charAt(bIndex))) {
                        bIndex++;
                    }

                    String headA = a.substring(0, aIndex);
                    String headB = b.substring(0, bIndex);

                    int result = headA.compareToIgnoreCase(headB);

                    if (result != 0) {
                        return result;
                    }

                    int aStart = aIndex;
                    int bStart = bIndex;

                    while (aIndex < a.length() && Character.isDigit(a.charAt(aIndex))) {
                        aIndex++;
                    }

                    while (bIndex < b.length() && Character.isDigit(b.charAt(bIndex))) {
                        bIndex++;
                    }

                    int numberA = Integer.parseInt(a.substring(aStart, aIndex));
                    int numberB = Integer.parseInt(b.substring(bStart, bIndex));

                    return Integer.compare(numberA, numberB);
                }
            });

            return files;
        }
    }
}
