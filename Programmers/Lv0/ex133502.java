package Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class ex133502 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        ex133502 outer = new ex133502();
        Solution sol = outer.new Solution();

        int result = sol.solution(arr1);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < ingredient.length; i++) {
                list.add(ingredient[i]);

                if (list.size() >= 4) {
                    int size = list.size();

                    if (list.get(size - 4) == 1 &&
                            list.get(size - 3) == 2 &&
                            list.get(size - 2) == 3 &&
                            list.get(size - 1) == 1) {

                        for (int j = 0; j < 4; j++) {
                            list.remove(list.size() - 1);
                        }
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}