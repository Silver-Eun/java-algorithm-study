package Lv0;

import java.util.HashMap;
import java.util.Scanner;

public class ex178871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr1 = new String[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }

        int m = sc.nextInt();
        String[] arr2 = new String[n];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.next();
        }

        ex178871 outer = new ex178871();
        Solution sol = outer.new Solution();

        String[] result = sol.solution(arr1, arr2);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public String[] solution(String[] players, String[] callings) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < players.length; i++) {
                map.put(players[i], i);
            }

            for (int i = 0; i < callings.length; i++) {
                String player = callings[i];

                int index = map.get(player);

                String frontPlayer = players[index - 1];

                players[index - 1] = player;
                players[index] = frontPlayer;

                map.put(player, index - 1);
                map.put(frontPlayer, index);
            }

            return players;
        }
    }
}