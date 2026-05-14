package Lv0;

import java.util.Scanner;

public class ex181926 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String control = sc.next();
        ex181926 outer = new ex181926();
        ex181926.Solution sol = outer.new Solution();

        int result = sol.solution(n, control);
        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int n, String control) {
            int answer = 0;

            for (int i = 0; i < control.length(); i++) {
                if (control.charAt(i) == 'w')
                    n++;
                else if (control.charAt(i) == 's')
                    n--;
                else if (control.charAt(i) == 'd')
                    n += 10;
                else if (control.charAt(i) == 'a')
                    n -= 10;
            }

            answer = n;

            return answer;
        }
    }
}