package Lv0;

import java.util.Arrays;
import java.util.Scanner;

public class ex120869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int spellSize = sc.nextInt();
        String[] spell = new String[spellSize];
        for (int i = 0; i < spellSize; i++) {
            spell[i] = sc.next();
        }

        int dicSize = sc.nextInt();
        String[] dic = new String[dicSize];
        for (int i = 0; i < dicSize; i++) {
            dic[i] = sc.next();
        }

        ex120869 outer = new ex120869();
        Solution sol = outer.new Solution();

        int result = sol.solution(spell, dic);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(String[] spell, String[] dic) {
            int answer = 2;

            Arrays.sort(spell);
            String target = String.join("", spell);

            for (int i = 0; i < dic.length; i++) {
                char[] arr = dic[i].toCharArray();
                Arrays.sort(arr);
                dic[i] = new String(arr);
            }

            for (int i = 0; i < dic.length; i++) {
                if (target.equals(dic[i]))
                    answer = 1;
            }

            return answer;
        }
    }
}