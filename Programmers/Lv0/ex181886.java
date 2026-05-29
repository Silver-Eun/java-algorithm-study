package Lv0;

import java.util.Scanner;

public class ex181886 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        ex181886 outer = new ex181886();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(names);

        for (String name : result) {
            System.out.print(name + " ");
        }

        sc.close();
    }

    class Solution {
        public String[] solution(String[] names) {
            String[] answer = new String[(names.length + 4) / 5];

            int idx = 0;

            for (int i = 0; i < names.length; i += 5) {
                answer[idx] = names[i];
                idx++;
            }

            return answer;
        }
    }
}