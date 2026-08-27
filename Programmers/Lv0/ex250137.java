package Lv0;

import java.util.Scanner;

public class ex250137 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bandage = new int[3];

        for (int i = 0; i < 3; i++) {
            bandage[i] = sc.nextInt();
        }

        int health = sc.nextInt();

        int n = sc.nextInt();

        int[][] attacks = new int[n][2];

        for (int i = 0; i < n; i++) {
            attacks[i][0] = sc.nextInt();
            attacks[i][1] = sc.nextInt();
        }

        ex250137 outer = new ex250137();
        Solution sol = outer.new Solution();

        int result = sol.solution(bandage, health, attacks);

        System.out.println(result);

        sc.close();
    }

    class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {

            int t = bandage[0];
            int x = bandage[1];
            int y = bandage[2];

            int currentHealth = health;
            int lastAttackTime = 0;

            for (int[] attack : attacks) {

                int attackTime = attack[0];
                int damage = attack[1];

                int healTime = attackTime - lastAttackTime - 1;

                currentHealth += healTime * x;

                if (healTime >= t) {
                    currentHealth += (healTime / t) * y;
                }

                currentHealth = Math.min(currentHealth, health);

                currentHealth -= damage;

                if (currentHealth <= 0) {
                    return -1;
                }

                lastAttackTime = attackTime;
            }

            return currentHealth;
        }
    }
}