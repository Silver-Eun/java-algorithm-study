package Lv0;

import java.util.Scanner;

public class ex120883 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] id_pw = new String[2];
        id_pw[0] = sc.next();
        id_pw[1] = sc.next();

        int n = sc.nextInt();
        String[][] db = new String[n][2];

        for (int i = 0; i < n; i++) {
            db[i][0] = sc.next();
            db[i][1] = sc.next();
        }

        ex120883 outer = new ex120883();
        Solution sol = outer.new Solution();

        String result = sol.solution(id_pw, db);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String solution(String[] id_pw, String[][] db) {

            for (int i = 0; i < db.length; i++) {

                if (id_pw[0].equals(db[i][0])) {

                    if (id_pw[1].equals(db[i][1])) {
                        return "login";
                    } else {
                        return "wrong pw";
                    }
                }
            }

            return "fail";
        }
    }
}