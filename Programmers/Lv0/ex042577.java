package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex042577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        String[] arr = new String[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.next();
        }

        ex042577 outer = new ex042577();
        Solution sol = outer.new Solution();

        boolean result = sol.solution(arr);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;

            Arrays.sort(phone_book);

            for (int i = 0; i < phone_book.length - 1; i++) {
                if (phone_book[i + 1].startsWith(phone_book[i])) {
                    return false;
                }
            }

            return true;
        }
    }
}